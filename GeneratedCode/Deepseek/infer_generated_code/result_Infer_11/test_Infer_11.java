import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {
    private C c = new C();

    @Test
    public void testNoLock() {
        c.showBug(); // TRIGGER BUG: LOCKLESS_VIOLATION
    }
}