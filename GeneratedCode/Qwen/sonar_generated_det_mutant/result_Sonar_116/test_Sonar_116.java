import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class BuggyServletTest {

    @Test
    public void testCounterIncrement() {
        BuggyServlet servlet = new BuggyServlet();
        assertEquals(0, servlet.showBug()); // Initial state check

        try {
            servlet.doGet("request1", "response1"); // TRIGGER BUG: Servlets should not have mutable instance fields
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(1, servlet.showBug());

        try {
            servlet.doGet("request2", "response2"); // TRIGGER BUG: Servlets should not have mutable instance fields
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(2, servlet.showBug());
    }

    @Test
    public void testConcurrentAccess() throws InterruptedException {
        BuggyServlet servlet = new BuggyServlet();

        Thread thread1 = new Thread(() -> {
            try {
                servlet.doGet("request1", "response1"); // TRIGGER BUG: Servlets should not have mutable instance fields
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                servlet.doGet("request2", "response2"); // TRIGGER BUG: Servlets should not have mutable instance fields
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        // Since the counter is mutable and accessed by multiple threads, the result is unpredictable.
        // We expect the test to fail because the final value of counter is not guaranteed to be 2.
        assertEquals(2, servlet.showBug());
    }
}