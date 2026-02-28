import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for C that triggers the INTERFACE_NOT_THREAD_SAFE bug.
 */
public class CTest {

    /**
     * Implementation of the I interface that does not ensure thread safety.
     */
    class NotThreadSafeImplementation implements I {
        @Override
        public void bar() {
            // Simulate some non-thread-safe operation
        }
    }

    /**
     * Test case that triggers the INTERFACE_NOT_THREAD_SAFE bug.
     */
    @Test
    public void testShowBug() {
        C c = new C();
        I notThreadSafeImpl = new NotThreadSafeImplementation();
        c.showBug(notThreadSafeImpl); // TRIGGER BUG: INTERFACE_NOT_THREAD_SAFE
    }
}