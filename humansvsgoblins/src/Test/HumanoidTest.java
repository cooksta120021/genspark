import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class HumanoidTest {
    Humanoid test;

    @BeforeEach
    void setUp() {
        test = new Humanoid();
    }

    @Test
    void getName() {
        assertNull(null, test.getName());
    }

    @Test
    void setName() {
        test.setName("Test");
        assertEquals("Test", test.getName());
    }

    @Test
    void getHealth() {
        assertEquals(0, test.getHealth());
    }

    @Test
    void setHealth() {
        test.setHealth(1000);
        assertEquals(1000, test.getHealth());
    }

    @Test
    void getAttack() {
        assertEquals(0, test.getAttack());
    }

    @Test
    void setAttack() {
        test.setAttack(10);
        assertEquals(10, test.getAttack());
    }

    @Test
    void getDefense() {
        assertEquals(0, test.getDefense());
    }

    @Test
    void setDefense() {
        test.setDefense(10);
        assertEquals(10, test.getDefense());
    }

    @Test
    void getLuck() {
        assertEquals(0, test.getLuck());
    }

    @Test
    void setLuck() {
        test.setLuck(10);
        assertEquals(10, test.getLuck());
    }

    @Test
    void getGold() {
        assertEquals(0, test.getGold());
    }

    @Test
    void setGold() {
        test.setGold(100);
        assertEquals(100, test.getGold());
    }

    @Test
    void getLevel() {
        assertEquals(0, test.getLevel());
    }

    @Test
    void setLevel() {
        test.setLevel(10);
        assertEquals(10, test.getLevel());
    }
}