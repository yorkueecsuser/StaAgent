import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidPatternSyntaxBugTest {
    @Test
    public void testShowBug() {
        InvalidPatternSyntaxBug buggyClass = new InvalidPatternSyntaxBug();

        String input = "Hello[World";
        // TRIGGER BUG: InvalidPatternSyntax
        String result = buggyClass.showBug(input);

        // We expect the result to be "HelloxWorld" but since the regex pattern is invalid,
        // a PatternSyntaxException will be thrown, causing the test to fail
        assertEquals("HelloxWorld", result);
    }
}