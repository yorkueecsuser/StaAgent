import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {
    @Test
    public void testNoLock() {
        C c = new C();
        c.showBug(); // TRIGGER BUG: LOCKLESS_VIOLATION
        fail("Expected an exception due to lockless violation.");
    }
}