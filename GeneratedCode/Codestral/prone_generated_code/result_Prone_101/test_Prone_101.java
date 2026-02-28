import org.junit.Test;
import static org.junit.Assert.*;

public class LockOnBoxedPrimitiveBugTest {

    @Test
    public void testBugTrigger() {
        LockOnBoxedPrimitiveBug bugClass1 = new LockOnBoxedPrimitiveBug();
        LockOnBoxedPrimitiveBug bugClass2 = new LockOnBoxedPrimitiveBug();

        Thread thread1 = new Thread(() -> {
            bugClass1.showBug(); // TRIGGER BUG: LockOnBoxedPrimitive
        });

        Thread thread2 = new Thread(() -> {
            bugClass2.showBug(); // TRIGGER BUG: LockOnBoxedPrimitive
        });

        thread1.start();
        thread2.start();

        // Due to caching of instances of boxed primitive types,
        // both threads might be synchronized on the same lock,
        // causing unexpected behavior and a test failure.
        assertNotSame(thread1.getState(), Thread.State.BLOCKED);
        assertNotSame(thread2.getState(), Thread.State.BLOCKED);
    }
}