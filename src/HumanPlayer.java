import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    // Constructor


    // Implementación del método makeGuess para el jugador humano
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su suposición: ");
        // int guess = numberScanner.nextInt();
        int guess = scanner.nextInt();
        getGuesses().add(guess);
        return guess;
    }

    public String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }
}
