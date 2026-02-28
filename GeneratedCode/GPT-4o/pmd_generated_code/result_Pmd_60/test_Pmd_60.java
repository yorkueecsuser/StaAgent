import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleSwitchTest {

    @Test
    public void testShowBugWithCase1() {
        ExampleSwitch example = new ExampleSwitch();
        String result = example.showBug(1); // TRIGGER BUG: NonCaseLabelInSwitch
        assertEquals("Case 1", result); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBugWithCase2() {
        ExampleSwitch example = new ExampleSwitch();
        String result = example.showBug(2); // This is a control test which should pass
        assertEquals("Case 2", result);
    }

    @Test
    public void testShowBugWithDefaultCase() {
        ExampleSwitch example = new ExampleSwitch();
        String result = example.showBug(3); // This is a control test which should pass
        assertEquals("Default case", result);
    }
}