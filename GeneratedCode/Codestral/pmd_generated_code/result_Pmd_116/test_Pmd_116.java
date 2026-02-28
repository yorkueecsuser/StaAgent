import org.junit.Test;
import static org.junit.Assert.*;

public class TooFewBranchesForSwitchBugTest {
    @Test
    public void testShowBugWithConditionOne() {
        TooFewBranchesForSwitchBug buggyClass = new TooFewBranchesForSwitchBug();
        assertEquals(1, buggyClass.showBug(1));  // TRIGGER BUG: TooFewBranchesForSwitch
    }

    @Test
    public void testShowBugWithDefaultCondition() {
        TooFewBranchesForSwitchBug buggyClass = new TooFewBranchesForSwitchBug();
        assertEquals(0, buggyClass.showBug(0));  // TRIGGER BUG: TooFewBranchesForSwitch
    }
}