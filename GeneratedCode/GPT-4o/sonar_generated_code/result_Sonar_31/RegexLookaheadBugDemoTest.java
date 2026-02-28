import org.junit.Test;
import static org.junit.Assert.*;

public class RegexLookaheadBugDemoTest {

    @Test
    public void testShowBugWithContradictoryPattern() {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc"); // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        assertEquals("Match found: b", result); // This will fail due to the bug
    }

    @Test
    public void testShowBugNoMatch() {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("xyz"); // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        assertEquals("No match found", result); // This will pass, as expected
    }
}