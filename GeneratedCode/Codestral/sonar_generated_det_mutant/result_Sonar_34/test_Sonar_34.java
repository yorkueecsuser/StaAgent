import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBoundaryBugTest {
    @Test
    public void testShowBug() {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
        assertFalse(bug.showBug("hello"));
    }
}