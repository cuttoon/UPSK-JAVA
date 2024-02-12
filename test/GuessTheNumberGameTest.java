import main.ComputerPlayer;
import main.GuessTheNumberGame;
import main.HumanPlayer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GuessTheNumberGameTest {

     @Test
     void startGame() {
          int guessedNumber = 42;

          String input = guessedNumber + "\n";
          InputStream inputStream = new ByteArrayInputStream(input.getBytes());
          System.setIn(inputStream);

          HumanPlayer humanPlayerMock = Mockito.mock(HumanPlayer.class);
          ComputerPlayer computerPlayerMock = Mockito.mock(ComputerPlayer.class);

          when(humanPlayerMock.makeGuess()).thenReturn(guessedNumber);
          when(computerPlayerMock.makeGuess()).thenReturn(guessedNumber);

          GuessTheNumberGame game = new GuessTheNumberGame(humanPlayerMock, computerPlayerMock);

          game.playGame();
     }
}