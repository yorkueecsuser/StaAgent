import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {

    @Test
    public void testFinalizeBug() {
        FinalizeBug bug = new FinalizeBug("Test Message");
        bug.showBug(); // Call the method that demonstrates the bug
        // TRIGGER BUG: FinalizeShouldBeProtected - The bug is triggered here as the finalize() method is called explicitly by the showBug() method, which is public.
    }
}