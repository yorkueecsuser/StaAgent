import org.junit.Test;
import static org.junit.Assert.*;

import java.util.logging.Level;
import java.util.logging.Logger;

class InterruptedExceptionExampleTest {

    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionExampleTest.class.getName());

    @Test
    public void testShowBug_InterruptedException() {
        InterruptedExceptionExample example = new InterruptedExceptionExample();

        Thread thread = new Thread(() -> {
            example.showBug(); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
        });
        thread.start();
        try {
            Thread.sleep(500); // Ensure the thread has started
            thread.interrupt(); // Interrupt the thread to trigger the bug
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            fail("Test thread was interrupted");
        }
    }

    @Test
    public void testShowBug_ThreadDeath() {
        InterruptedExceptionExample example = new InterruptedExceptionExample();

        try {
            example.showBug(); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
            fail("Expected ThreadDeath to be thrown");
        } catch (ThreadDeath e) {
            // Expected outcome, test will pass
        }
    }
}