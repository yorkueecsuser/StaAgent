import org.junit.Test;
import static org.junit.Assert.*;

public class NonFinalFieldBugTest {

    @Test
    public void testBug() {
        assertEquals(20, NonFinalFieldBug.showBug()); // Initial value should be 20

        // TRIGGER BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
        NonFinalFieldBug.buggyField = 30; // Changing the field from another package

        // The test case should fail here, as the value of buggyField has been changed
        assertEquals(20, NonFinalFieldBug.showBug());
    }
}