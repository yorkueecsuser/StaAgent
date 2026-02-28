import org.junit.Test;
import static org.junit.Assert.*;

public class BoxedPrimitiveLockTest {

    @Test
    public void testShowBug() {
        BoxedPrimitiveLock instance1 = new BoxedPrimitiveLock();
        BoxedPrimitiveLock instance2 = new BoxedPrimitiveLock();

        Thread thread1 = new Thread(() -> instance1.showBug()); // TRIGGER BUG: LockOnBoxedPrimitive
        Thread thread2 = new Thread(() -> instance2.showBug()); // TRIGGER BUG: LockOnBoxedPrimitive

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            fail("Expected synchronization issue due to LockOnBoxedPrimitive bug."); // TRIGGER BUG: LockOnBoxedPrimitive
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}