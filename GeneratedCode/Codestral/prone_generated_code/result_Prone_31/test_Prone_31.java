import org.junit.Test;
import static org.junit.Assert.*;

public class DeadExceptionBugTest {

    @Test
    public void testDeadException() {
        DeadExceptionBug bug = new DeadExceptionBug();
        try {
            bug.showBug(); // TRIGGER BUG: DeadException
            fail("Expected NullPointerException not thrown");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}