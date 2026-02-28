import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        int index = 11; // index is out of bounds
        try {
            BuggyCode.showBug();
            fail("Expected an StringIndexOutOfBoundsException to be thrown");
        } catch (StringIndexOutOfBoundsException anExc) {
            // If the exception is thrown as expected, the test passes
        }
    }
}