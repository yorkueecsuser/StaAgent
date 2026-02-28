import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionHandlingDemoTest {

    @Test
    public void testShowBug() {
        ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
        demo.showBug(); // TRIGGER BUG: Only one method invocation is expected when testing checked exceptions
    }
}