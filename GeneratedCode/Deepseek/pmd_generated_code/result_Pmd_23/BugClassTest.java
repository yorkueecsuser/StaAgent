import org.junit.Test;
import static org.junit.Assert.*;

public class BugClassTest {
    BugClass bugClass = new BugClass();

    @Test
    // TRIGGER BUG: ClassCastExceptionWithToArray
    public void testShowBug() {
        try {
            Integer[] a = bugClass.showBug();
            fail("Expected ClassCastException to be thrown"); // If no exception is thrown fail the test
        } catch (ClassCastException e) {
            // Expected exception is thrown, pass the test
        }
    }
}