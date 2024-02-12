package main;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    private Random random;
    private int targetNumber;
    private int maxIntentos = 5;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    public GuessTheNumberGame(HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
        random = new Random();
        targetNumber = random.nextInt(100) + 1;
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
    }

    public static void main(String[] args){
        HumanPlayer humanPlayer = new HumanPlayer("Karen");
        ComputerPlayer computerPlayer = new ComputerPlayer();
        GuessTheNumberGame game = new GuessTheNumberGame(humanPlayer, computerPlayer);
        game.playGame();
    }

    public void playGame() {
        System.out.println("¡Bienvenida!");
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

        for (int attempts = 1; attempts <= maxIntentos; attempts++) {
            System.out.println("\nIntento " + String.format("%02d", attempts));

            System.out.println("\nmain.Player #1");
            int currentGuess = humanPlayer.makeGuess();
            humanPlayer.addGuess(currentGuess);
            checkProximity(currentGuess);

            if (checkGuess(currentGuess)) {
                System.out.println("¡Felicidades! " + humanPlayer.getName() + " ha adivinado el número en " + attempts + " intentos.");
                break;
            }

            System.out.println("main.Player #2");
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

    private void printGuesses(Player player) {
        System.out.println("\n" + player.getName() + "'s Jugadas:");
        ArrayList<Integer> uniqueGuesses = new ArrayList<>(new LinkedHashSet<>(player.getGuesses()));

        for (int i = 0; i < Math.min(uniqueGuesses.size(), maxIntentos); i++) {
            System.out.println("Intento " + String.format("%02d", i + 1) + ": " + uniqueGuesses.get(i));
        }
        System.out.println();
    }

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
