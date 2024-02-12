package main;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {

    private String name;
    private ArrayList<Integer> guesses;

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void setGuesses(ArrayList<Integer> guesses) {
        this.guesses = guesses;
    }

    public void addGuess(int guess) {
        guesses.add(guess);
    }

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }


}
