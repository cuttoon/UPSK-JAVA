package test;

import main.GuessTheNumberGame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {



    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

     @Test
    void startGame(){
        GuessTheNumberGame game = new GuessTheNumberGame();
        // aprendiendo de aserciones
        assertNotNull(game);
    }
}