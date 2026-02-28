import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticBugTest {

    @Test
    public void testShowBugTriggers() {
        // Initial value check
        assertEquals(0, MutableStaticBug.mutableValue);
        
        // Change the mutable static field
        MutableStaticBug.showBug(42); // TRIGGER BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)
        
        // Test fails because mutableValue has been changed unexpectedly
        assertEquals(0, MutableStaticBug.mutableValue); // This assertion will fail, demonstrating the bug
    }
}