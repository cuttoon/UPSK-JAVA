import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    // Atributos
    private Random random;
    private int targetNumber;
    private int maxIntentos = 5;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    // Constructor donde inicializo como el generador de numeros aleatorios
    public GuessTheNumberGame() {
        random = new Random();
        targetNumber = random.nextInt(100) + 1;
        humanPlayer = new HumanPlayer(getPlayerName());
        computerPlayer = new ComputerPlayer();
    }

    // Método main para inicalizar el juego el juego
    public static void main(String[] args){
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.playGame();
    }

    private void playGame() {
        System.out.println("¡Bienvenida!");
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

        for (int attempts = 1; attempts <= maxIntentos; attempts++) {
            System.out.println("\nIntento " + String.format("%02d", attempts));

            System.out.println("\nPlayer #1");
            int currentGuess = humanPlayer.makeGuess();
            humanPlayer.addGuess(currentGuess);
            checkProximity(currentGuess);

            if (checkGuess(currentGuess)) {
                System.out.println("¡Felicidades! " + humanPlayer.getName() + " ha adivinado el número en " + attempts + " intentos.");
                break;
            }

            System.out.println("Player #2");
            currentGuess = computerPlayer.makeGuess();
            computerPlayer.addGuess(currentGuess);
            System.out.println("Suposición de la computadora: " + currentGuess);
            checkProximity(currentGuess);

            if (checkGuess(currentGuess)) {
                System.out.println("¡La computadora ha adivinado el número en " + attempts + " intentos!");
                break;
            }
        }

        System.out.println("\nFin del juego. El número objetivo era: " + targetNumber);

        printGuesses(humanPlayer);
        printGuesses(computerPlayer);
    }


    // Eliminando duplicados con LinkedHashSet
    private void printGuesses(Player player) {
        System.out.println("\n" + player.getName() + "'s Jugadas:");
        ArrayList<Integer> uniqueGuesses = new ArrayList<>(new LinkedHashSet<>(player.getGuesses()));

        for (int i = 0; i < Math.min(uniqueGuesses.size(), maxIntentos); i++) {
            System.out.println("Intento " + String.format("%02d", i + 1) + ": " + uniqueGuesses.get(i));
        }
        System.out.println();
    }

    // Verificar que la suposicón sea igual al que se ingresa
    private boolean checkGuess(int guess) {
        return guess == targetNumber;
    }

    private void checkProximity(int guess) {
        int difference = Math.abs(targetNumber - guess);

        if (difference <= 10) {
            System.out.println("¡Estás cerca! 😊");
        } else {
            System.out.println("Estás lejos. 😢");
        }
    }

    private String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }
}
