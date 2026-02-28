import org.junit.Test;
import static org.junit.Assert.*;

public class RegexSyntaxDemonstrationTest {

    @Test
    public void testShowBugWithInvalidRegex() {
        RegexSyntaxDemonstration demo = new RegexSyntaxDemonstration();
        demo.showBug("aaab"); // TRIGGER BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    }
}