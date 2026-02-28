import org.junit.Test;
import static org.junit.Assert.*;

public class MutableFieldServletTest {

    @Test
    public void testCounterIncrement() {
        MutableFieldServlet servlet = new MutableFieldServlet();
        servlet.doGet("request1", "response1"); // TRIGGER BUG: Servlets should not have mutable instance fields
        assertEquals(1, servlet.showBug());
        servlet.doGet("request2", "response2"); // TRIGGER BUG: Servlets should not have mutable instance fields
        assertEquals(2, servlet.showBug());
        servlet.doGet("request3", "response3"); // TRIGGER BUG: Servlets should not have mutable instance fields
        assertEquals(3, servlet.showBug());
    }

    @Test
    public void testConcurrentAccess() throws InterruptedException {
        MutableFieldServlet servlet = new MutableFieldServlet();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    servlet.doGet("request", "response"); // TRIGGER BUG: Servlets should not have mutable instance fields
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    servlet.doGet("request", "response"); // TRIGGER BUG: Servlets should not have mutable instance fields
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Since the counter is not thread-safe, the final value may not be 200, causing the test to fail.
        assertFalse(servlet.showBug() == 200);
    }
}