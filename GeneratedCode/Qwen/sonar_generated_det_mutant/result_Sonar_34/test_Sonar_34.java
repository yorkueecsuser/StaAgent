import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBoundaryBugTest {

    @Test
    public void testShowBugWithNonMatchingPattern() {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        assertEquals("No match found", bugDemo.showBug("example")); // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
    }

    @Test
    public void testShowBugWithAnotherNonMatchingPattern() {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        assertEquals("No match found", bugDemo.showBug("anotherExample")); // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
    }
}