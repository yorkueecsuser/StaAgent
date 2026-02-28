import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        // TRIGGER BUG: AssignmentInOperand
        assertEquals("3!", buggyCode.showBug());
    }
}