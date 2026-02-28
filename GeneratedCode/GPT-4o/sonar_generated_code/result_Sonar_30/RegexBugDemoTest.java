import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugDemoTest {

    @Test
    public void testShowBug() {
        RegexBugDemo demo = new RegexBugDemo();
        String pattern = demo.showBug(""); // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        assertEquals("\\ca", pattern);
    }
    
    @Test
    public void testShowBug2() {
        RegexBugDemo demo = new RegexBugDemo();
        String pattern = demo.showBug2(""); // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        assertEquals("\\c!", pattern);
    }
}