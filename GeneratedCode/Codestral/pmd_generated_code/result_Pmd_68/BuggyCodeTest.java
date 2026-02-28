import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        assertEquals("A. O. K.", buggyCode.showBug()); // TRIGGER BUG: ReturnFromFinallyBlock
    }
}