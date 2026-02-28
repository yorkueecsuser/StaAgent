import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBugWithEmptyString() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("", example.showBug("")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }

    @Test
    public void testShowBugWithNonMatchingString() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("", example.showBug("abcxyz")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }

    @Test
    public void testShowBugWithMatchingString() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("x", example.showBug("x")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }
}