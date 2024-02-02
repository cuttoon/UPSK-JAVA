package main;

import java.util.Random;

public class ComputerPlayer extends  Player{
    public ComputerPlayer() {
        super("Computer");
    }

    public int makeGuess() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
