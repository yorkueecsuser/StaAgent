import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {
    MyThread myThread = new MyThread();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
        assertNotEquals(1, myThread.showBug().size()); // This line triggers the bug
    }
}