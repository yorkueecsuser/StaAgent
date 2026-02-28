import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptedExampleTest {

    @Test
    public void testShowBug() {
        InterruptedExample example = new InterruptedExample();
        Thread thread = new Thread(() -> {
            boolean result = example.showBug(); // TRIGGER BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)  
            assertFalse(result); // This assertion will fail because the method returns true when interrupted
        });
        thread.start();
        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            // This exception is due to the test thread being interrupted, not the bug
        }
    }
}