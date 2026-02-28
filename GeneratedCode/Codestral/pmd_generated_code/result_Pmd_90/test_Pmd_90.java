import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidThreadGroupBugTest {
    @Test
    public void testShowBug() {
        AvoidThreadGroupBug bug = new AvoidThreadGroupBug();
        ThreadGroup tg = bug.showBug(); // TRIGGER BUG: AvoidThreadGroup
        assertNotNull(tg); // This line is just to make sure the test doesn't fail due to no assertions
    }
}