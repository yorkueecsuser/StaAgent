import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {
    @Test
    public void testBug() throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            try {
                lock.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            try {
                lock.notifyAll();
            } catch (IllegalMonitorStateException e) {
                e.printStackTrace();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        // TRIGGER BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
    }
}