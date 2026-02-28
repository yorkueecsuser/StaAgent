import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBugWithNull() {
        BuggyCode buggyCode = new BuggyCode();
        // TRIGGER BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        assertFalse(buggyCode.showBug(null));
    }
}