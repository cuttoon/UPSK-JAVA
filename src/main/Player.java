package main;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {

    // declarando variables
    // name: nombre de la jugadora
    // guesses: Historial de suposiciones de la jugadora
    private String name;
    private ArrayList<Integer> guesses;

    // nuevo metodo abstracto
    public abstract int makeGuess();

    // getter and setter
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

    // constructor, para poder inicializar el objeto
    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }


}
