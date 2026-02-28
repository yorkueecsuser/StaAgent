import org.junit.Test;
import static org.junit.Assert.*;

public class LocklessViolationTest {
    @Test
    public void testShowBug() {
        LocklessViolation.showBug();
        // TRIGGER BUG: LOCKLESS_VIOLATION
    }
}