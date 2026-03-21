import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyThreadTest {
    @Test
    public void testShowBug() {
        BuggyThread buggyThread = new BuggyThread();
        buggyThread.showBug();
        // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
        // The bug is triggered when only one thread is notified, leaving the other one waiting.
        // This test case will fail because the second thread will remain waiting indefinitely.
    }
}