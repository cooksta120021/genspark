import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void feedback() {
        assertEquals(false, Main.feedback(0, 2));
        assertEquals(false, Main.feedback(4, 2));
        assertEquals(true, Main.feedback(2, 2));
    }

    @Test
    void isPlayAgain() {
        assertEquals(true, Main.isPlayAgain("y"));
        assertEquals(false, Main.isPlayAgain("n"));
    }
}