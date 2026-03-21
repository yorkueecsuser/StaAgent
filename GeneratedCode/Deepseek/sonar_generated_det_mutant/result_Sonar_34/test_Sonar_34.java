import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBoundariesBugTest {
    RegexBoundariesBug bug = new RegexBoundariesBug();

    @Test
    public void testShowBug() {
        String result = bug.showBug(); // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
        assertEquals("No match found", result); // The noncompliant code should never match anything
    }
}