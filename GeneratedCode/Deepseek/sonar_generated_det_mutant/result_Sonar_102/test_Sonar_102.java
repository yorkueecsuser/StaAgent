import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        try {
            bugDemo.showBug();
            // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
            fail("Bug not triggered");
        } catch (IllegalMonitorStateException ex) {
            // This exception is expected when notify() is called when no thread is waiting
            // on the condition.
        } catch (Exception e) {
            fail("Unexpected exception: " + e.toString());
        }
    }
}