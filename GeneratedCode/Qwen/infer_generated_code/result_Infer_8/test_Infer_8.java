import org.junit.Test;
import static org.junit.Assert.*;

public class GuardedByViolationExampleTest {

    @Test
    public void testGuardedByViolation() {
        GuardedByViolationExample example = new GuardedByViolationExample();
        example.showBug("test"); // TRIGGER BUG: GUARDEDBY_VIOLATION
        assertEquals("test", example.showBug("test")); // TRIGGER BUG: GUARDEDBY_VIOLATION
    }
}