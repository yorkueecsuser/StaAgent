import org.junit.Test;
import static org.junit.Assert.*;

public class NonExistentOperatorsDemoTest {

    @Test
    public void testShowBug() {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        int result = demo.showBug(-5, 3); // TRIGGER BUG: Non-existent operators like "=+" should not be used
        assertEquals("The result should be -8 for correct compound operation -=", -8, result);
    }

    @Test
    public void testShowBug2() {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        int result = demo.showBug2(-5, 3); // TRIGGER BUG: Non-existent operators like "=+" should not be used
        assertEquals("The result should be -2 for correct compound operation +=", -2, result);
    }
}