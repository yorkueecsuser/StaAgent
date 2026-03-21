import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBug() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("Match found: a", example.showBug("a")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
        assertEquals("Match found: b", example.showBug("b")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
        assertEquals("Match found: c", example.showBug("c")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
        assertEquals("No match found", example.showBug("ab")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
        assertEquals("No match found", example.showBug("bc")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }
}