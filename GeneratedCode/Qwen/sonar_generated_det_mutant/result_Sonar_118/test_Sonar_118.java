import org.junit.Test;
import static org.junit.Assert.*;

public class LockingExampleTest {

    @Test
    public void testShowBugWithLockNotReleased() {
        LockingExample example = new LockingExample();
        example.showBug(); // TRIGGER BUG: Locks should be released on all paths
    }
}