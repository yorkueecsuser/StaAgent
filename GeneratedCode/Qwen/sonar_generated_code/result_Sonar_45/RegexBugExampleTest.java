import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBugWithA() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("a", example.showBug("a")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithB() {
        RegexBugExample example = new RegexBugExample();
        assertNull(example.showBug("b")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithC() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("c", example.showBug("c")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithAB() {
        RegexBugExample example = new RegexBugExample();
        assertNull(example.showBug("ab")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithBC() {
        RegexBugExample example = new RegexBugExample();
        assertNull(example.showBug("bc")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithAC() {
        RegexBugExample example = new RegexBugExample();
        assertNull(example.showBug("ac")); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }
}