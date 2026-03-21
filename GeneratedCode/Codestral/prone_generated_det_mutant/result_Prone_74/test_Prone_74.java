import org.junit.Test;
import static org.junit.Assert.*;

public class IndexOfCharBugTest {
    @Test
    public void testShowBug() {
        String input = "Hello, World!";
        char searchChar = 'l';
        int startIndex = 3;
        int expectedResult = 3; // 'l' is at index 3 and 9, but we start the search from index 3
        int result = IndexOfCharBug.showBug(input, searchChar, startIndex); // TRIGGER BUG: IndexOfChar
        assertEquals(expectedResult, result);
    }
}