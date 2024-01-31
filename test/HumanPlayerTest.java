import main.HumanPlayer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HumanPlayerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void makeGuess() {
    }

    @Test
    public void testMakeGuess() {

        HumanPlayer humanPlayer = new HumanPlayer("Karen");
        Scanner scanner = mock(Scanner.class);

        when(scanner.nextLine()).thenReturn("50");

        // Llamar al método makeGuess
        int guess = humanPlayer.makeGuess();

        // Verificar que el resultado
        assertEquals(50, guess);
    }

}