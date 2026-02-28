import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testConcurrentAccess() throws InterruptedException {
        MyClass myClass = new MyClass();

        // Create two threads that will call showBug() concurrently
        Thread threadA = new Thread(() -> {
            try {
                myClass.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                List<String> strings = myClass.showBug();

                // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                // The bug is triggered here because we are accessing the `strings` list before it has been fully initialized
                assertNotNull(strings);
                assertEquals(2, strings.size());
                assertTrue(strings.contains("Hello"));
                assertTrue(strings.contains("World"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        threadA.start();
        threadB.start();

        // Wait for both threads to finish
        threadA.join();
        threadB.join();
    }
}