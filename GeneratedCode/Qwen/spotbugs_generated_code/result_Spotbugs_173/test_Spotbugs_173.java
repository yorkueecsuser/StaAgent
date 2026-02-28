import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizerBugExampleTest {

    @Test
    public void testShowBug() {
        FinalizerBugExample example = new FinalizerBugExample();
        String result = example.showBug(); // TRIGGER BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED) 
        assertEquals("Check console for finalize message", result);
    }
}