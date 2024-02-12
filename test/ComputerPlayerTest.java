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

        // Simular el comportamiento para nextInt pero con Random
        int number = 40;
        when(random.nextInt(100)).thenReturn(number);

        // Crear la instancia de ComputerPlayer utilizando el constructor con Random
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Llamar al metodo makeGuess
        int guess = computerPlayer.makeGuess();

        // verificamos que el resultado este dentro del rango (1 a 100)
        assertTrue(guess >= 1 && guess <= 100);
    }
}