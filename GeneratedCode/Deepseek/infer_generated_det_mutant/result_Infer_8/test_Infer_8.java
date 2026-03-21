import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    private BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        // Trigger the bug by calling showBug without locking
        try {
            buggyCode.showBug("test");
            // TRIGGER BUG: GUARDEDBY_VIOLATION
        } catch (Exception e) {
            assertTrue(e instanceof IllegalMonitorStateException);
        }
    }
}