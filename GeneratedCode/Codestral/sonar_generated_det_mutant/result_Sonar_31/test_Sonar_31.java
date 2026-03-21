import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyRegexTest {
    @Test
    public void testShowBug() {
        BuggyRegex buggyRegex = new BuggyRegex();
        // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        assertFalse(buggyRegex.showBug("b"));
    }
}