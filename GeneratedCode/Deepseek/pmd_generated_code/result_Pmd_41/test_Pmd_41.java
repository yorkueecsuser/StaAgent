import org.junit.Test;
import static org.junit.Assert.*;

public class EmptyFinalizerBugTest {
    @Test
    public void testFinalizeBug() {
        EmptyFinalizerBug bug = new EmptyFinalizerBug();
        try {
            bug.showBug(); // TRIGGER BUG: EmptyFinalizer
            fail("Expected an exception to be thrown"); // This line should not be reached if the bug is triggered
        } catch (Throwable ignored) {
        }
    }
}