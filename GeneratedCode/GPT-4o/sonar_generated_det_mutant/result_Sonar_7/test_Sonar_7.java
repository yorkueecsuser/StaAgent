import org.junit.Test;
import static org.junit.Assert.*;

public class BlockingOperationExampleTest {

    @Test
    public void testBugTrigger() {
        BlockingOperationExample example = new BlockingOperationExample();
        Thread platformThread = new Thread(() -> {
            try {
                String result = example.showBug("http://example.com");
                assertNotNull(result); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
            } catch (Exception e) {
                fail("Exception should not have been thrown"); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
            }
        });
        platformThread.start(); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
        try {
            platformThread.join(); // Ensure the thread completes
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}