import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Thread currentThread = Thread.currentThread();

        try {
            // TRIGGER BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
            currentThread.wait(); // This line triggers the bug
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // We should not reach here, because the thread is waiting and notifying on itself
        fail("The bug was not triggered");
    }
}