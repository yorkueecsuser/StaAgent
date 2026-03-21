import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test // TRIGGER BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    public void triggerBug() {
        BugDemo demo = new BugDemo();
        assertTrue(demo.showBug().size() == 2); // This ensures that the bug is triggered and asserts that the list size is 2
    }
}