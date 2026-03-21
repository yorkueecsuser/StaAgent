import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugTest {

    @Test // TRIGGER BUG: Regex lookahead assertions should not be contradictory
    public void testShowBug() {
        RegexBug bug = new RegexBug();
        String result = bug.showBug();
        assertEquals("Match found", result);
    }
}