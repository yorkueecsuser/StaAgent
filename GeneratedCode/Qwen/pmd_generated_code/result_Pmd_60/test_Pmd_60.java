import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchExampleTest {

    @Test
    public void testShowBugWithNonCaseLabel() {
        SwitchExample example = new SwitchExample();
        assertEquals("Case 1", example.showBug(1)); // TRIGGER BUG: NonCaseLabelInSwitch
    }

    @Test
    public void testShowBugCase2() {
        SwitchExample example = new SwitchExample();
        assertEquals("Case 2", example.showBug(2));
    }

    @Test
    public void testShowBugDefaultCase() {
        SwitchExample example = new SwitchExample();
        assertEquals("Default Case", example.showBug(3));
    }
}