import org.junit.Test;
import static org.junit.Assert.*;

public class RegexAnchorBugDemoTest {

    @Test
    public void testShowBugWithA() {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();
        boolean result = demo.showBug("a");
        assertTrue("Expected 'a' to match, but it didn't.", result); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithB() {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();
        boolean result = demo.showBug("b");
        assertFalse("Expected 'b' not to match as it should not be anchored, but it did.", result); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithC() {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();
        boolean result = demo.showBug("c");
        assertTrue("Expected 'c' to match, but it didn't.", result); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }

    @Test
    public void testShowBugWithAB() {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();
        boolean result = demo.showBug("ab");
        assertFalse("Expected 'ab' not to match, but it did.", result); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }
}