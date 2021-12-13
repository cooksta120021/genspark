import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class GoblinTest {
    Goblin test;

    @BeforeEach
    void setUp() {
        test = new Goblin("Tester");
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
        assertEquals(10, test.getAttack());
    }

    @Test
    void setAttack() {
        test.setAttack(10);
        assertEquals(10, test.getAttack());
    }

    @Test
    void getDefense() {
        assertEquals(8, test.getDefense());
    }

    @Test
    void setDefense() {
        test.setDefense(12);
        assertEquals(12, test.getDefense());
    }

    @Test
    void getLuck() {
        assertEquals(2, test.getLuck());
    }

    @Test
    void setLuck() {
        test.setLuck(4);
        assertEquals(4, test.getLuck());
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
        test.setLevel(2);
        assertEquals(2, test.getLevel());
    }

    @Test
    void testToString() {
        assertEquals("Goblin: { Name: Tester, Level: 0, Health: 1100, Attack: 10, Defense: 8, Luck: 2}",
                test.toString());
    }
}