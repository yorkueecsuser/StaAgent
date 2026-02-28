import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionDemoTest {

    @Test
    public void testShowBugWithNegativeInput() {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1); // TRIGGER BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        fail("Expected IllegalArgumentException to be thrown"); // TRIGGER BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
    }

    @Test
    public void testShowBugWithPositiveInput() {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.showBug(1);
            // No exception should be thrown, pass the test
        } catch (IllegalArgumentException e) {
            fail("No exception should be thrown for positive input");
        }
    }
}