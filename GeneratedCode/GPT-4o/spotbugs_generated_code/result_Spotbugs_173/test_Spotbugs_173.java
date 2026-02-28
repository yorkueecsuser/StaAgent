import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizerAccessExampleTest {

    @Test
    public void testShowBug() {
        FinalizerAccessExample example = new FinalizerAccessExample();
        String result = example.showBug(); // TRIGGER BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        assertNull("Expected null due to incorrect finalize method access", result);
    }
}