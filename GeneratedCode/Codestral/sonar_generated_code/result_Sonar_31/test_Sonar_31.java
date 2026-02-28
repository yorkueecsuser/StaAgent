import org.junit.Test;
import static org.junit.Assert.*;

public class RegexLookaheadBugTest {
    @Test
    public void testShowBug() {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        assertFalse(bug.showBug("ab")); // This should return false, but due to the bug, it returns true
    }
}