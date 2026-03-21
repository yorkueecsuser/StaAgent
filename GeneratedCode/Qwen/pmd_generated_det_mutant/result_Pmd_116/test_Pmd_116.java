import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchExampleTest {

    @Test
    public void testShowBugWithOne() {
        SwitchExample example = new SwitchExample();
        assertEquals("One", example.showBug(1)); // TRIGGER BUG: TooFewBranchesForSwitch
    }

    @Test
    public void testShowBugWithOther() {
        SwitchExample example = new SwitchExample();
        assertEquals("Other", example.showBug(2)); // TRIGGER BUG: TooFewBranchesForSwitch
    }
}