import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {
    private DeadlockExample deadlockExample = new DeadlockExample();

    @Test
    public void testShowBug() {
        // This should fail, triggering a deadlock
        deadlockExample.showBug(); // TRIGGER BUG: DEADLOCK
    }
}