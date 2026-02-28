import org.junit.Test;
import static org.junit.Assert.*;

public class TooFewBranchesForSwitchTest {

    TooFewBranchesForSwitch obj = new TooFewBranchesForSwitch();

    @Test
    public void testShowBug() {
        obj.showBug(1); // TRIGGER BUG: TooFewBranchesForSwitch
    }
}