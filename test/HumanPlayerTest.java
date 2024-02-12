import main.HumanPlayer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class HumanPlayerTest {

    @Test
    void testGetName() {

        String name = "Karen";

        HumanPlayer humanPlayer = new HumanPlayer(name);

        String playerName = humanPlayer.getName();
        assertEquals(name, playerName);
    }

}