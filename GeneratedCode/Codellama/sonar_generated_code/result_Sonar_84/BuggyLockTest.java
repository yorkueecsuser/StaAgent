import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyLockTest {
    @Test
    public void testBug() {
        BuggyLock lock = new BuggyLock();
        lock.showBug(); // TRIGGER BUG: "wait" should not be called when multiple locks are held
    }
}