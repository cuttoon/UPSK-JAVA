import java.util.Random;

public class GuessTheNumberGame {

    private Random random;
    private int targetNumber;
    private int maxIntentos = 5;
    private HumanPlayer humanPlayer;

    public GuessTheNumberGame() {
        random = new Random();
        targetNumber = random.nextInt(100) + 1;
        humanPlayer = new HumanPlayer("");
    }

    public static void main(String[] args){
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.playGame();
    }

    private void playGame() {
        System.out.println("¡Bienvenido a Guess The Number Game!");
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

        for (int attempts = 1; attempts <= maxIntentos; attempts++) {
            System.out.println("\nIntento " + attempts);
            int guess = humanPlayer.makeGuess();

            if (checkGuess(guess)) {
                System.out.println("¡Felicidades! " + humanPlayer.getName() + " ha adivinado el número en " + attempts + " intentos.");
                break;
            } else {
                // Verificar proximidad y mostrar mensaje
                checkProximity(guess);
            }
        }

        System.out.println("\nFin del juego. El número objetivo era: " + targetNumber);
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
}
