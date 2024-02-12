package main;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
    }

    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su suposición: ");
        int guess = scanner.nextInt();
        getGuesses().add(guess);
        return guess;
    }
}
