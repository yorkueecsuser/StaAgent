import org.junit.Test;
import static org.junit.Assert.*;

public class RegexLookaheadBugExampleTest {

    @Test
    public void testShowBug() {
        RegexLookaheadBugExample example = new RegexLookaheadBugExample();
        boolean result = example.showBug("ab"); // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        assertTrue("Expected true, but got false due to the bug in regex pattern", result);
    }

    @Test
    public void testShowBugWithDifferentInput() {
        RegexLookaheadBugExample example = new RegexLookaheadBugExample();
        boolean result = example.showBug("b"); // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        assertTrue("Expected true, but got false due to the bug in regex pattern", result);
    }
}