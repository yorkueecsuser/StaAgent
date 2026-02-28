import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    private BugDemo demo = new BugDemo();

    @Test
    public void testShowBug() {
        assertTrue(demo.showBug()); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}