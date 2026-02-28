import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {

    @Test
    public void testLocklessViolation() {
        C c = new C();
        c.showBug(); // TRIGGER BUG: LOCKLESS_VIOLATION
    }
}