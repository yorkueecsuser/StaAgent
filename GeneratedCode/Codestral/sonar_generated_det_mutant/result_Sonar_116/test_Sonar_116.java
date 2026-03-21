import org.junit.Test;
import static org.junit.Assert.*;

public class MutableInstanceFieldServletTest {

    @Test
    public void testConcurrentAccessToCounter() {
        MutableInstanceFieldServlet servlet = new MutableInstanceFieldServlet();

        // Create multiple threads to concurrently access the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                servlet.showBug(); // TRIGGER BUG: Servlets should not have mutable instance fields
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                servlet.showBug(); // TRIGGER BUG: Servlets should not have mutable instance fields
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the counter is not equal to the expected value due to race condition
        assertEquals(2000, servlet.showBug());
    }
}