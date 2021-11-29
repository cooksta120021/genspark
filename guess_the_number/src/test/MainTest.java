import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main main = new Main();

    @Test
    void randomGen() {
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

    @Test
    void main() {
    }
}