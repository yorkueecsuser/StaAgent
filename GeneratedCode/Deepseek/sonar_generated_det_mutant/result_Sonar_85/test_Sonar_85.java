import org.junit.Test;
import static org.junit.Assert.*;

public class StringBugTest {
    private StringBug stringBug = new StringBug();

    @Test
    public void testNegativeIndex() {
        stringBug.showBug("test", -1); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    @Test
    public void testTooLargeIndex() {
        stringBug.showBug("test", 5); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}