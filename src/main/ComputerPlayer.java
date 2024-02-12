package main;

import java.util.Random;

public class ComputerPlayer extends  Player{
    // Constructor con el nombre de "Computer"
    public ComputerPlayer(String name) {
        super(name != null ? name : "Computer");
    }

    public ComputerPlayer(){
        this(null);
    }

    public int makeGuess() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
