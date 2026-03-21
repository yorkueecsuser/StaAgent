import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionDemoTest {

    @Test
    public void testShowBugWithFThrowingException() {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(); // TRIGGER BUG: Only one method invocation is expected when testing checked exceptions
    }

    @Test
    public void testShowBugWithGThrowingException() {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(); // TRIGGER BUG: Only one method invocation is expected when testing checked exceptions
    }
}