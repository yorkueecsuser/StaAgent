import org.junit.Test;
import static org.junit.Assert.*;

public class BugTest {
    // TRIGGER BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    @Test
    public void testShowBug() {
        try {
            Bug.showBug(); // This line triggers the bug
            fail("Expected a StringIndexOutOfBoundsException to be thrown");
        } catch (StringIndexOutOfBoundsException e) {
            // This test passes if an exception is thrown
        }
    }
}