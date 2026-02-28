import org.junit.Test;
import static org.junit.Assert.*;

public class DeadThreadExampleTest {

    @Test
    public void testShowBug() {
        DeadThreadExample example = new DeadThreadExample();
        
        // The expectation here is that the thread should be started and a message
        // "Thread is running" should be printed, but due to the bug, it will not happen.
        String result = example.showBug(); // TRIGGER BUG: DeadThread
        
        // This assertion will fail because the thread does not run and print anything.
        assertEquals("Thread is running", result); // TRIGGER BUG: DeadThread
    }
}