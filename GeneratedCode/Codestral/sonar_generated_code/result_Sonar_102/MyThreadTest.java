import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {
    @Test
    // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
    public void testNotifyBug() {
        MyThread myThread = new MyThread();
        myThread.showBug();
        // The test should fail here because only one thread is notified instead of all waiting threads
    }
}