import org.junit.Test;
import static org.junit.Assert.*;

public class DemoIncompatibleArgumentTypeTest {

    @Test
    public void testShowBugWithString() {
        DemoIncompatibleArgumentType demo = new DemoIncompatibleArgumentType();
        boolean result = demo.showBug("test"); // TRIGGER BUG: IncompatibleArgumentType
        assertFalse("Expected false due to incompatible argument type", result);
    }

    @Test
    public void testShowBugWithNumber() {
        DemoIncompatibleArgumentType demo = new DemoIncompatibleArgumentType();
        boolean result = demo.showBug("2"); // TRIGGER BUG: IncompatibleArgumentType
        assertFalse("Expected false due to incompatible argument type", result);
    }
}