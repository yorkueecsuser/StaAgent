import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    private final BugDemo bugDemo = new BugDemo();

    @Test
    public void testShowBug() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                bugDemo.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        // Adding a small delay to ensure that the thread has started
        Thread.sleep(100);

        bugDemo.setLock(true);  // This call to setLock should trigger the IllegalMonitorStateException

        // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}