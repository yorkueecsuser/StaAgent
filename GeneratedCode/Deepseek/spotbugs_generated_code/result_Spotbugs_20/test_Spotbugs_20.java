import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        int result = buggyCode.showBug();
        // TRIGGER BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        assertNotEquals(1, result);
    }
}