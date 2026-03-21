import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBug1() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("buggy", example.showBug1()); // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    }

    @Test
    public void testShowBug2() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("buggy", example.showBug2()); // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
    }

    @Test
    public void testShowCompliant() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("compliant", example.showCompliant());
    }
}