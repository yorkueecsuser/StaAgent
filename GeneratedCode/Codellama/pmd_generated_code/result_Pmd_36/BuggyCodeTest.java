import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        try {
            buggyCode.showBug(); // TRIGGER BUG: DoNotTerminateVM
            fail("Expected System.exit(0) to be called");
        } catch (RuntimeException e) {
            assertEquals("Expected System.exit(0) to be called", e.getMessage());
        }
    }
}