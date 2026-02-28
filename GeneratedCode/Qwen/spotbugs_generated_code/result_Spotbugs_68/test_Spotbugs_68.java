import org.junit.Test;
import static org.junit.Assert.*;

public class ArgumentOrderBugTest {

    @Test
    public void testShowBugWithNullValue() {
        ArgumentOrderBug bugDemo = new ArgumentOrderBug();
        bugDemo.showBug("This is a message", null); // TRIGGER BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    }
}