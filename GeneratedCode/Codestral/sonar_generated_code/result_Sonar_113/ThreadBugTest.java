import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadBugTest {

    @Test
    public void testShowBug() throws InterruptedException {
        ThreadBug bug = new ThreadBug();
        try {
            bug.showBug(); // TRIGGER BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } catch (IllegalMonitorStateException e) {
            // This exception is expected due to the bug in the code
            // If no exception is thrown, the above line should fail the test
        }
        fail("IllegalMonitorStateException was not thrown");
    }
}