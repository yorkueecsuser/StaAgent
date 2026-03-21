import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        bugExample.showBug();
    }
}