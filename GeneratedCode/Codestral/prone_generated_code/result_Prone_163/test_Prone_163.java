import org.junit.Test;
import static org.junit.Assert.*;

public class ThrowNullBugTest {
    @Test
    public void testShowBug() {
        ThrowNullBug bug = new ThrowNullBug();
        try {
            bug.showBug(); // TRIGGER BUG: ThrowNull
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}