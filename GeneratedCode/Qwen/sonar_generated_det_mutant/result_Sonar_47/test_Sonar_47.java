import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBug1() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("", example.showBug1("abc")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }

    @Test
    public void testShowBug2() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("", example.showBug2("abc")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }

    @Test
    public void testShowBug3() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("abc", example.showBug3("abc")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }

    @Test
    public void testShowBug4() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("abc", example.showBug4("abc")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }

    @Test
    public void testShowBug5() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("abc", example.showBug5("abc")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }

    @Test
    public void testShowBug6() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("abc", example.showBug6("abc")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }
}