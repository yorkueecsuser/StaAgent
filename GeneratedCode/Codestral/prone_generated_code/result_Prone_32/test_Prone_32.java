import org.junit.Test;
import static org.junit.Assert.*;

public class DeadThreadBugTest {

    @Test
    public void testDeadThreadBug() {
        DeadThreadBug bugInstance = new DeadThreadBug();
        bugInstance.showBug(); // TRIGGER BUG: DeadThread
        // The thread will never be executed since it was not started, causing the test case to fail
    }
}