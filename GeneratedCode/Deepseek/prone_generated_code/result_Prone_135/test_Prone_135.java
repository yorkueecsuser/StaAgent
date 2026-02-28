import org.junit.Test;
import static org.junit.Assert.*;

public class PreconditionsInvalidPlaceholderTest {

    @Test
    public void testShowBug() {
        PreconditionsInvalidPlaceholder bug = new PreconditionsInvalidPlaceholder();
        try {
            bug.showBug("Hello"); // TRIGGER BUG: PreconditionsInvalidPlaceholder
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Error length: %d", e.getMessage()); // This will fail
        }
    }
}