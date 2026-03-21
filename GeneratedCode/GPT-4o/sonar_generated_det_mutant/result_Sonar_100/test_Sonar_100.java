import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testShowBugWithNonNullColor() {
        BugDemo demo = new BugDemo("blue");
        demo.showBug("blue"); // TRIGGER BUG: "@NonNull" values should not be set to null
    }

    @Test
    public void testShowBugWithNullColor() {
        BugDemo demo = new BugDemo();
        demo.showBug(null); // TRIGGER BUG: "@NonNull" values should not be set to null
    }
}