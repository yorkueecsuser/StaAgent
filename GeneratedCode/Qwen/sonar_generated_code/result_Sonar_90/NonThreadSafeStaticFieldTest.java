import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeStaticFieldTest {

    @Test
    public void testShowBugWithConcurrentAccess() throws InterruptedException {
        NonThreadSafeStaticField instance1 = new NonThreadSafeStaticField();
        NonThreadSafeStaticField instance2 = new NonThreadSafeStaticField();

        Thread thread1 = new Thread(() -> {
            assertEquals("2023-10-01 12:00:00", instance1.showBug("2023-10-01 12:00:00")); // TRIGGER BUG: Non-thread-safe fields should not be static
        });

        Thread thread2 = new Thread(() -> {
            assertEquals("2023-10-02 13:00:00", instance2.showBug("2023-10-02 13:00:00")); // TRIGGER BUG: Non-thread-safe fields should not be static
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}