import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    Main m = new Main();

    @Test
    public void testBuggyMethod() {
        String result = m.showBug(); // The bug is triggered here
        // TRIGGER BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        assertEquals("This line contains the bug", result);
    }
}