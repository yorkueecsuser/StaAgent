import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    // TRIGGER BUG: Expressions used in "assert" should not produce side effects
    public void testShowBug() {
        bugExample.showBug();
    }
}