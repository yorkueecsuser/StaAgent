import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointEqualityBugTest {
    @Test
    public void testShowBug() {
        FloatingPointEqualityBug bug = new FloatingPointEqualityBug();
        float myNumber = 3.146f;
        // TRIGGER BUG: Floating point numbers should not be tested for equality
        assertFalse(bug.showBug(myNumber));
    }
}