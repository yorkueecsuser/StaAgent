import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyRegexTest {
    @Test
    public void testBugTrigger() {
        BuggyRegex buggyRegex = new BuggyRegex();
        // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        String result = buggyRegex.showBug("\\c!");
        assertNotEquals("Compiled successfully", result);
    }
}