import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {

    // declarando variables
    // name: nombre de la jugadora
    // guesses: Historial de suposiciones de la jugadora
    private String name;
    private static ArrayList<Integer> guesses;

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void setGuesses(ArrayList<Integer> guesses) {
        this.guesses = guesses;
    }

    // protected static Scanner numberScanner = new Scanner(System.in);


    // constructor
    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }


}
