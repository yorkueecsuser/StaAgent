import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {

    @Test
    public void testShowBug() {
        DeadlockExample example = new DeadlockExample();
        example.showBug(); // TRIGGER BUG: DEADLOCK
        // The test will fail due to the deadlock situation.
        // This is expected to illustrate the problem.
    }
}