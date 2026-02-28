import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();

        // Test case where input is true, it should trigger the bug
        assertTrue(buggyCode.showBug(true)); // TRIGGER BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)

        // Test case where input is false, it should not trigger the bug as the if condition will evaluate to false
        assertFalse(buggyCode.showBug(false));
    }
}