import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {
    @Test
    public void testBugTrigger() {
        A a = new A();
        // TRIGGER BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        a.showBug(); // Calling the method that triggers the bug
    }
}