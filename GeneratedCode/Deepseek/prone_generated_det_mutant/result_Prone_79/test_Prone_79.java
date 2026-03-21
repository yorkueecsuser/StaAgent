import org.junit.Test;
import static org.junit.Assert.*;

public class BugRuleExampleTest {
    private BugRuleExample bugRuleExample = new BugRuleExample();

    @Test
    public void testShowBug() {
        bugRuleExample.showBug(); // TRIGGER BUG: InlineMeValidator
    }
}