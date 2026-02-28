import org.junit.Test;
import static org.junit.Assert.*;

public class RegexLookaheadBugTest {

    @Test
    public void testContradictoryLookahead() {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: Regex lookahead assertions should not be contradictory
        assertEquals("b", result); // This assertion will fail because the pattern is contradictory and should not match anything
    }
}