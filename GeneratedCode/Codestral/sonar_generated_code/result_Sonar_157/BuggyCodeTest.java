import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        // TRIGGER BUG: Related "if/else if" statements should not have the same condition
        assertEquals("Move window to the background", buggyCode.showBug(1));
    }
}