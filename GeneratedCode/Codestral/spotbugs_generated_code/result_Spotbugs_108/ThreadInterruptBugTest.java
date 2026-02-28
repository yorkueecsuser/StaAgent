import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadInterruptBugTest {
    @Test
    public void testInterruptedBug() {
        ThreadInterruptBug buggyClass = new ThreadInterruptBug();
        Thread buggyThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        buggyThread.start();
        buggyThread.interrupt();
        // TRIGGER BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        assertTrue(buggyClass.showBug(buggyThread));
        // The test should fail as showBug method incorrectly calls Thread.interrupted() instead of buggyThread.isInterrupted()
    }
}