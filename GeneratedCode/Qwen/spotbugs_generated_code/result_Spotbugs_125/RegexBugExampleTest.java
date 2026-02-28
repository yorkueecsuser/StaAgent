import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testInvalidRegex() {
        RegexBugExample example = new RegexBugExample();
        // The following line triggers the bug by calling showBug with an input that will cause the invalid regex to be compiled
        assertEquals("Unmatched closing \']\' for \'[\'", example.showBug("test")); // TRIGGER BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION) 
    }
}