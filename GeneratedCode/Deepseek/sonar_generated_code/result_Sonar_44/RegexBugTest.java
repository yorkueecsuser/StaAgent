import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugTest {

    private RegexBug bug = new RegexBug();

    @Test
    public void testShowBug() {
        assertEquals("a", bug.showBug("[ab]|a", "a"));  // TRIGGER BUG: Regex alternatives should not be redundant
        assertEquals("anything", bug.showBug(".*|a", "anything"));  // TRIGGER BUG: Regex alternatives should not be redundant
    }
}