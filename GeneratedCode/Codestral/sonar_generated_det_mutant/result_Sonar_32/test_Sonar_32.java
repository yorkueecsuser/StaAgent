import org.junit.Test;
import static org.junit.Assert.*;

public class BackReferenceBugTest {

    @Test
    public void testShowBug_TriggerBug_BackReferencesInRegex() {
        BackReferenceBug bug = new BackReferenceBug();
        assertFalse(bug.showBug("a")); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }
}