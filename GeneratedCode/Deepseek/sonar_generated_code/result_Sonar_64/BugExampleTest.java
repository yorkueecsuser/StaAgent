import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        try {
            BugExample.showBug(-1); // TRIGGER BUG: Exceptions should not be created without being thrown
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("x must be nonnegative", e.getMessage());
        }
    }
}