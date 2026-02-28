import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class LazyInitializationDemoTest {

    @Test
    public void testLazyInitializationDemo() throws InterruptedException {
        LazyInitializationDemo demo = new LazyInitializationDemo();
        CountDownLatch latch1 = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(1);

        Thread thread1 = new Thread(() -> {
            try {
                latch1.countDown();
                latch2.await();
                List<String> result = demo.showBug(); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                assertNotNull("Result should not be null", result);
                assertEquals("First element should be 'Hello'", "Hello", result.get(0));
                assertEquals("Second element should be 'World'", "World", result.get(1));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                latch1.await();
                List<String> result = demo.showBug(); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                assertNotNull("Result should not be null", result);
                assertEquals("First element should be 'Hello'", "Hello", result.get(0));
                assertEquals("Second element should be 'World'", "World", result.get(1));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        thread1.start();
        thread2.start();
        latch2.countDown();

        thread1.join();
        thread2.join();
    }
}