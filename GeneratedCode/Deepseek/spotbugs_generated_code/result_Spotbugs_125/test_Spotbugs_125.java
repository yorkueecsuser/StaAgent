import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidRegexBugTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        InvalidRegexBug.showBug();
    }
}