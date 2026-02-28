import org.junit.Test;
import static org.junit.Assert.*;

public class IsInstanceBugDemoTest {

    @Test
    public void testShowBug() {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        assertTrue(demo.showBug()); // TRIGGER BUG: IsInstanceIncompatibleType
    }
}