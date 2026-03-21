import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        assertEquals(50, buggyCode.showBug(50), 0.0);  // Expected output: 50, actual output: 50
        assertEquals(100, buggyCode.showBug(150), 0.0); // Expected output: 100, actual output: 150
        assertEquals(0, buggyCode.showBug(-50), 0.0); // Expected output: 0, actual output: -50
    }
}