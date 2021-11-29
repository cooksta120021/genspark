import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void chooseCave() {
        assertEquals("You have found some treasure...", main.chooseCave(1));
        assertEquals("You were eaten instantly...", main.chooseCave(2));
        assertEquals("Loser...", main.chooseCave(0));
        assertEquals("Loser...", main.chooseCave(500));
    }

    @Test
    void main() {
    }
}