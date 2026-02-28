import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitThreadBugTest {
    @Test
    public void testShowBug() {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        // TRIGGER BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
        assertTrue("The test should fail due to the bug in the JUnitThreadBug class", false);
    }
}