import org.junit.Test;
import static org.junit.Assert.*;

public class VulnerableServletTest {

    @Test
    public void testShowBugConcurrentModification() {
        VulnerableServlet servlet = new VulnerableServlet();

        // Simulating concurrent requests
        Thread thread1 = new Thread(() -> {
            String result = servlet.showBug("input1"); // TRIGGER BUG: Servlets should not have mutable instance fields
            assertEquals("Processed input: input1", result);
        });

        Thread thread2 = new Thread(() -> {
            String result = servlet.showBug("input2"); // TRIGGER BUG: Servlets should not have mutable instance fields
            assertEquals("Processed input: input2", result);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}