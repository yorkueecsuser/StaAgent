import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizerBugTest {
    @Test
    // TRIGGER BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
    public void testShowBug() {
        FinalizerBug.showBug();
        // As the finalize() method is public, it can be directly accessed outside the class, which should not be the case.
        // This will trigger the bug and lead to a test failure.
    }
}