import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssertionBugTest {

    @Test
    public void testShowBug() {
        SelfAssertionBug bug = new SelfAssertionBug();
        Object x = new Object();

        // TRIGGER BUG: SelfAssertion
        assertFalse(bug.showBug(x));
    }
}