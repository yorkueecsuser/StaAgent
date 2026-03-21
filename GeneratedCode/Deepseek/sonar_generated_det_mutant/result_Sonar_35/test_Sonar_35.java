import org.junit.Test;
import java.util.regex.*;
import static org.junit.Assert.*;

public class RegexBugTest {
    private RegexBug bug = new RegexBug();

    @Test
    public void testBug() {
        try {
            Pattern pattern1 = bug.showBug();
            Matcher matcher1 = pattern1.matcher("a");
            assertTrue(matcher1.matches()); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
        } catch (Exception e) {
            fail("The bug was not triggered.");
        }
    }
}