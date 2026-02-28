import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyRegexTest {
    @Test
    public void testShowBug() {
        BuggyRegex buggyRegex = new BuggyRegex();
        // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        assertNotEquals("Match found", buggyRegex.showBug("a"));
        assertNotEquals("Match found", buggyRegex.showBug("!"));
    }
}