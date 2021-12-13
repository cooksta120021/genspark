import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class HumanTest {
    Human test;

    @BeforeEach
    void setUp() {
        test = new Human("Tester");
    }

    @Test
    void getName() {
        assertEquals("Tester", test.getName());
    }

    @Test
    void setName() {
        test.setName("TestThis");
        assertEquals("TestThis", test.getName());
    }

    @Test
    void getHealth() {
        test.setName("TestThis");
        assertEquals("TestThis", test.getName());
    }

    @Test
    void setHealth() {
        test.setHealth(1000);
        assertEquals(1000, test.getHealth());
    }

    @Test
    void getAttack() {
        assertEquals(8, test.getAttack());
    }

    @Test
    void setAttack() {
        test.setAttack(10);
        assertEquals(10, test.getAttack());
    }

    @Test
    void getDefense() {
        assertEquals(10, test.getDefense());
    }

    @Test
    void setDefense() {
        test.setDefense(12);
        assertEquals(12, test.getDefense());
    }

    @Test
    void getLuck() {
        assertEquals(3, test.getLuck());
    }

    @Test
    void setLuck() {
        test.setLuck(4);
        assertEquals(4, test.getLuck());
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
        assertEquals(1, test.getLevel());
    }

    @Test
    void setLevel() {
        test.setLevel(2);
        assertEquals(2, test.getLevel());
    }

    @Test
    void testToString() {
        assertEquals("Human: { Name: Tester, Level: 1, Health: 900, Attack: 8, Defense: 10, Luck: 3, Inventory: [Empty], Gold: 0}",
                test.toString());
    }
}