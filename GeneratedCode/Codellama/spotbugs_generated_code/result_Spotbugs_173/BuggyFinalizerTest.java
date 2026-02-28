import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyFinalizerTest {
    @Test
    public void testFinalize() {
        // TRIGGER BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        BuggyFinalizer bf = new BuggyFinalizer();
        bf.finalize();
    }
}