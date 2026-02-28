import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockDemoTest {
    @Test
    public void testCreateDeadlock() {
        DeadlockDemo demo = new DeadlockDemo();
        demo.showBug();
        // TRIGGER BUG: "wait" should not be called when multiple locks are held
        // The test case will fail as ThreadB is unable to acquire the lock on mon1, causing a deadlock.
    }
}