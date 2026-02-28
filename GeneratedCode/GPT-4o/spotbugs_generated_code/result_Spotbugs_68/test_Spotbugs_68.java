import org.junit.Test;
import static org.junit.Assert.*;

public class ArgumentOrderBugDemoTest {

    @Test
    public void testShowBugWithNullValue() {
        ArgumentOrderBugDemo demo = new ArgumentOrderBugDemo();
        demo.showBug("This is a test message", null); // TRIGGER BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    }
}