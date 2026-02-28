import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadWaitNotifyBugTest {

    @Test
    public void testShowBug() {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        try {
            String result = bugDemo.showBug(); // TRIGGER BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
            fail("Expected an IllegalMonitorStateException to be thrown");
        } catch (IllegalMonitorStateException e) {
            // Expected exception
        }
    }
}