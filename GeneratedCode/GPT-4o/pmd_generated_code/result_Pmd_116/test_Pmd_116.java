import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchExampleTest {

    @Test
    public void testShowBugWithCase1() {
        SwitchExample example = new SwitchExample();
        String result = example.showBug(1); // TRIGGER BUG: TooFewBranchesForSwitch
        assertEquals("Case 1 executed", result);
    }

    @Test
    public void testShowBugWithDefault() {
        SwitchExample example = new SwitchExample();
        String result = example.showBug(2); // TRIGGER BUG: TooFewBranchesForSwitch
        assertEquals("Some other case executed", result); // This will fail and trigger the bug
    }
}