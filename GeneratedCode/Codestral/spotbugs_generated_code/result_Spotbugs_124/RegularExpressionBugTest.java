import org.junit.Test;
import static org.junit.Assert.*;

public class RegularExpressionBugTest {
    @Test
    public void testShowBug() {
        RegularExpressionBug bug = new RegularExpressionBug();
        String output = bug.showBug("a.b|c"); // TRIGGER BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        assertNotEquals(output, "a|b.c");
    }
}