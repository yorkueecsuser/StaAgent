import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsExampleTest {

    @Test
    public void testShowBug() {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        
        // Test case to trigger the negative index bug
        example.showBug(""); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds

        // Test case to trigger index beyond string length bug
        example.showBug("a"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds

        // Test case to trigger beginIndex greater than endIndex bug
        example.showBug("abcd"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds

        // Test case to trigger endIndex beyond string length bug
        example.showBug("example"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}