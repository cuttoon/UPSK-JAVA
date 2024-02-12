import main.HumanPlayer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class HumanPlayerTest {

    /* @Test
    void makeGuess() {

        String name = "Karen";
        int number = 50;

        // Crear con mockito simulando un objeto
        Scanner scanneer = Mockito.mock(Scanner.class);
        when(scanneer.nextInt()).thenReturn(number);

        HumanPlayer humanPlayer = new HumanPlayer(name);
        // Llamar al método makeGuess
        int guess = humanPlayer.makeGuess();


        // Verificar que el resultado
        assertEquals(50, guess);
    } */

    @Test
    void testGetName() {

        String name = "Karen";

        HumanPlayer humanPlayer = new HumanPlayer(name);

        String playerName = humanPlayer.getName();
        assertEquals(name, playerName);
    }

}