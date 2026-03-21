import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionDemoTest {

    @Test
    public void testCalculateSquareWithNegativeValue() {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug1(-5); // TRIGGER BUG: Calls to methods should not trigger an exception
    }

    @Test
    public void testConfirmInitializationWithUninitializedObject() {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug2(false); // TRIGGER BUG: Calls to methods should not trigger an exception
    }
}