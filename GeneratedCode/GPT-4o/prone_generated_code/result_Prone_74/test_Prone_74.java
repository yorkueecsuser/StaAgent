import org.junit.Test;
import static org.junit.Assert.*;

public class IndexOfCharBugDemoTest {

    @Test
    public void testShowBugWithUnicodeCodePoint() {
        IndexOfCharBugDemo demo = new IndexOfCharBugDemo();
        String example = "Example string with multiple words.";
        
        int unicodeCodePoint = 101; // Unicode for 'e'
        int startIndex = 0;
        
        // This will trigger the bug because indexOf expects a char, not a Unicode code point
        int result = demo.showBug(example, unicodeCodePoint, startIndex); // TRIGGER BUG: IndexOfChar
        
        // We expect the first 'e' at index 0, but due to the bug, this could fail unexpectedly
        assertEquals(0, result); // TRIGGER BUG: IndexOfChar
    }

    @Test
    public void testShowBugWithCorrectChar() {
        IndexOfCharBugDemo demo = new IndexOfCharBugDemo();
        String example = "Example string with multiple words.";
        
        char character = 'e';
        int startIndex = 0;
        
        // Correct usage should find the first 'e' at index 0
        int result = demo.showBug(example, character, startIndex); // This line does not trigger the bug
        
        assertEquals(0, result); // This assertion should pass without the bug
    }
}