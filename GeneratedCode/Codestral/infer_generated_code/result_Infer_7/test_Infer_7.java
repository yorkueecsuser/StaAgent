import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {
    @Test
    public void testDeadlock() {
        DeadlockExample deadlockExample = new DeadlockExample();
        deadlockExample.showBug(); // TRIGGER BUG: DEADLOCK

        // The test should not reach this point, as the deadlock will cause the test to hang indefinitely.
        fail("Test should not reach this point due to deadlock");
    }
}