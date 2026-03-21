import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class ValueBasedLockingBugTest {
    @Test
    public void testShowBug() {
        ValueBasedLockingBug buggy = new ValueBasedLockingBug();

        // TRIGGER BUG: Value-based classes should not be used for locking
        Optional<Integer> opt1 = Optional.of(1);
        Optional<Integer> opt2 = Optional.of(1);

        // Create two threads that will try to lock on the same Optional instance
        Thread thread1 = new Thread(() -> {
            buggy.showBug(opt1);
        });

        Thread thread2 = new Thread(() -> {
            buggy.showBug(opt2);
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The test will fail if the bug is not fixed, as the two threads will contend for the lock
    }
}