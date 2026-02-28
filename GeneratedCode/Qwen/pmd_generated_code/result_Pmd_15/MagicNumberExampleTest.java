import org.junit.Test;
import static org.junit.Assert.*;

public class MagicNumberExampleTest {

    @Test
    public void testShowBug() {
        MagicNumberExample example = new MagicNumberExample();
        assertEquals("Ten", example.showBug(10)); // TRIGGER BUG: AvoidLiteralsInIfCondition
    }

    @Test
    public void testShowBug1() {
        MagicNumberExample example = new MagicNumberExample();
        assertTrue(example.showBug1(".")); // TRIGGER BUG: AvoidLiteralsInIfCondition
    }

    @Test
    public void testShowBug2() {
        MagicNumberExample example = new MagicNumberExample();
        assertTrue(example.showBug2(0.1)); // TRIGGER BUG: AvoidLiteralsInIfCondition
    }

    @Test
    public void testShowBug3() {
        MagicNumberExample example = new MagicNumberExample();
        assertTrue(example.showBug3(5, 0)); // TRIGGER BUG: AvoidLiteralsInIfCondition
    }

    @Test
    public void testShowBug4() {
        MagicNumberExample example = new MagicNumberExample();
        assertTrue(example.showBug4(5, "none")); // TRIGGER BUG: AvoidLiteralsInIfCondition
    }
}