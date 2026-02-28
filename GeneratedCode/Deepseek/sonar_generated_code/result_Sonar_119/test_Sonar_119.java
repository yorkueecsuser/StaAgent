import org.junit.Test;
import static org.junit.Assert.*;

public class AtomicBugTest {
    private AtomicBug testInstance = new AtomicBug();

    @Test
    public void testShowBug() {
        boolean result = testInstance.showBug();
        assertFalse("The bug should be triggered here // TRIGGER BUG: \".equals()\" should not be used to test the values of \"Atomic\" classes", result);
    }
}