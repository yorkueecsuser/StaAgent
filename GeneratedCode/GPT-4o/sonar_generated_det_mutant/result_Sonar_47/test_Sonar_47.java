import org.junit.Test;
import static org.junit.Assert.*;

public class RegexPatternExampleTest {

    @Test
    public void testShowBugWithEmptyString() {
        RegexPatternExample example = new RegexPatternExample();
        String result = example.showBug(""); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
        assertEquals("[]", result); // Expecting no match since the input is empty, but it triggers the bug
    }

    @Test
    public void testShowBugWithNonEmptyString() {
        RegexPatternExample example = new RegexPatternExample();
        String result = example.showBug("xxxyyy"); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
        assertEquals("[x][x][x]", result); // Expecting only 'x' matches, but it triggers the bug
    }
}