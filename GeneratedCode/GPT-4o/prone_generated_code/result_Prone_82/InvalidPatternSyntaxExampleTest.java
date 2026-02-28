import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidPatternSyntaxExampleTest {

    @Test
    public void testShowBugWithValidInput() {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("abcdef"); // TRIGGER BUG: InvalidPatternSyntax
        assertEquals("xxxxxx", result);
    }
    
    @Test
    public void testShowBugWithEmptyString() {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug(""); // TRIGGER BUG: InvalidPatternSyntax
        assertEquals("", result);
    }

    @Test
    public void testShowBugWithSpecialCharacters() {
        InvalidPatternSyntaxExample example = new InvalidPatternSyntaxExample();
        String result = example.showBug("12345"); // TRIGGER BUG: InvalidPatternSyntax
        assertEquals("12345", result);
    }
}