import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testBuggyCode() {
        BuggyCode buggyCode = new BuggyCode();
        // TRIGGER BUG: "null" should not be used with "Optional"
        buggyCode.showBug();
        assertEquals("null", buggyCode.getOptional().orElse("null"));
    }
}