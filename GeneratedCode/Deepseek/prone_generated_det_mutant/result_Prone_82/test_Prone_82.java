import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidPatternSyntaxTest {
    InvalidPatternSyntax invalidPatternSyntax = new InvalidPatternSyntax();

    // TRIGGER BUG: InvalidPatternSyntax
    @Test(expected = java.util.regex.PatternSyntaxException.class)
    public void testShowBug() {
        invalidPatternSyntax.showBug();
    }
}