import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderExampleTest {

    @Test
    public void testShowBug() {
        // Create an instance of the class to test
        StringBuilderExample example = new StringBuilderExample();
        
        // Call the method with a character that will cause the bug
        String result = example.showBug('A'); // TRIGGER BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        
        // The expected result should be "A was not used as initial content.", but due to the bug, it will not match
        assertEquals("A was not used as initial content.", result);
    }

    @Test
    public void testShowBugBuffer() {
        // Create an instance of the class to test
        StringBuilderExample example = new StringBuilderExample();
        
        // Call the method with a character that will cause the bug
        String result = example.showBugBuffer('B'); // TRIGGER BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        
        // The expected result should be "B was not used as initial content.", but due to the bug, it will not match
        assertEquals("B was not used as initial content.", result);
    }
}