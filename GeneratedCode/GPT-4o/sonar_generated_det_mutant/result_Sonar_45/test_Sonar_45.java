import org.junit.Test;
import static org.junit.Assert.*;

public class RegexAnchorBugExampleTest {

    @Test
    public void testShowBugWithA() {
        RegexAnchorBugExample example = new RegexAnchorBugExample();
        assertTrue(example.showBug("a")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithB() {
        RegexAnchorBugExample example = new RegexAnchorBugExample();
        assertFalse(example.showBug("b")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithC() {
        RegexAnchorBugExample example = new RegexAnchorBugExample();
        assertTrue(example.showBug("c")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithD() {
        RegexAnchorBugExample example = new RegexAnchorBugExample();
        assertFalse(example.showBug("d")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }
}