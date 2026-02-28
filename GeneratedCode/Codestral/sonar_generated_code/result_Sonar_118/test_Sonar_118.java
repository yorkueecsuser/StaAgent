import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testDoSomethingBug() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.initialize(); // Initialize the object before calling showBug() method
        buggyClass.showBug(); // TRIGGER BUG: Locks should be released on all paths
        assertTrue(buggyClass.lock.tryLock()); // This will fail if lock is not released
    }
}