import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBugWithZero() {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setNumber(0); // TRIGGER BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
        buggyCode.showBug();
    }
}