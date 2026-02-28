import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedConditionalTestBugTest {

    @Test
    public void testShowBug() {
        RepeatedConditionalTestBug bug = new RepeatedConditionalTestBug();
        assertFalse("Trigger BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)", bug.showBug(0));
    }
}