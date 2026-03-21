import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptedExceptionBugTest {

    @Test
    public void testShowBug() {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(() -> {
            bug.showBug(); // TRIGGER BUG: "InterruptedException" should not be ignored
            assertTrue(Thread.currentThread().isInterrupted()); // Fail if thread is not interrupted
        });
        bugThread.start();
        bugThread.interrupt();
        try {
            bugThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}