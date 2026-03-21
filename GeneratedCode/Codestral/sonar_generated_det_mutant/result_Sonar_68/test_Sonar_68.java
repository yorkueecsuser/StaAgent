import org.junit.Test;
import static org.junit.Assert.*;

public class BuggySwitchTest {
    private BuggySwitch buggySwitch = new BuggySwitch();

    @Test
    public void testShowBug() {
        buggySwitch.showBug(1); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        buggySwitch.showBug(2); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        buggySwitch.showBug(3); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        buggySwitch.showBug(4); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }
}