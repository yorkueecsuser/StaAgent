import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    BuggyCode buggyCode = new BuggyCode();

    @Test
    // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator.
    public void testShowBug() {
        assertTrue(buggyCode.showBug(1, 2)); // Line 5
        assertFalse(buggyCode.showBug(1, 1)); // Line 6
        assertTrue(buggyCode.showBug(1, 1)); // Line 12
        assertTrue(buggyCode.showBug(1, 1)); // Line 13
    }

    @Test(expected = ArithmeticException.class)
    // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator.
    public void testShowBug2() {
        buggyCode.showBug2(1); // Line 23
    }
}