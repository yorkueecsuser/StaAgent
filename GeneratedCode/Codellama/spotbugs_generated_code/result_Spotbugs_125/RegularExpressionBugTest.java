import org.junit.Test;
import static org.junit.Assert.*;

class RegularExpressionBugTest {
    @Test
    public void testInvalidRegularExpression() {
        String regex = "a*b+c"; // Invalid regular expression
        try {
            Pattern pattern = Pattern.compile(regex); // TRIGGER BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
            fail("Expected PatternSyntaxException to be thrown");
        } catch (PatternSyntaxException e) {
            // Expected exception thrown
        }
    }
}