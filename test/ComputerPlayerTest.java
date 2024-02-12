import main.ComputerPlayer;
import main.GuessTheNumberGame;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ComputerPlayerTest {

    @Test
    void makeGuess() {

        Random random = Mockito.mock(Random.class);

        int number = 40;
        when(random.nextInt(100)).thenReturn(number);

        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        int guess = computerPlayer.makeGuess();

        assertTrue(guess >= 1 && guess <= 100);
    }
}