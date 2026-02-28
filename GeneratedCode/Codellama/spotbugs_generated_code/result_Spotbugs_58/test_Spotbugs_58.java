import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExceptionExampleTest {
    @Test
    public void testBugTrigger() {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        try {
            example.showBug();
            fail("Expected NullPointerException not thrown"); // TRIGGER BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        } catch (NullPointerException e) {
            // Expected exception thrown
        }
    }
}