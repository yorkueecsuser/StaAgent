import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class SelfAssertionBugTest {
    SelfAssertionBug bug = new SelfAssertionBug();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: SelfAssertion
        bug.showBug(); // Line 9
    }
}