import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptedExceptionBugTest {
    @Test
    public void testShowBug() {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        try {
            Thread.sleep(100); // give some time for the bugThread to start
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bugThread.interrupt();
        // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
        assertTrue("The thread should be interrupted", bugThread.isInterrupted());
    }
}