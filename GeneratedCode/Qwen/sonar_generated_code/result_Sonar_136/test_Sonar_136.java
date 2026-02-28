import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptedThreadExampleTest {

    @Test
    public void testShowBugWithInterruptedException() {
        InterruptedThreadExample example = new InterruptedThreadExample();
        Thread thread = new Thread(example::showBug);
        thread.start();

        // Interrupt the thread after some delay
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        thread.interrupt();

        // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            fail("Test failed due to InterruptedException");
        }
    }

    @Test
    public void testShowBugWithThreadDeath() {
        InterruptedThreadExample example = new InterruptedThreadExample();
        Thread thread = new Thread(() -> {
            example.showBug();
            // Simulate ThreadDeath by stopping the thread abruptly
            Thread.currentThread().stop(); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
        });
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            fail("Test failed due to InterruptedException");
        }
    }
}