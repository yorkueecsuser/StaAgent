import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testShowBug() {
        BugDemo demo = new BugDemo();
        demo.showBug(); // TRIGGER BUG: Unnecessary equality checks should not be made
        fail("Expected failure due to unnecessary equality checks."); // This will fail because showBug will not throw an exception despite the logic errors
    }
}