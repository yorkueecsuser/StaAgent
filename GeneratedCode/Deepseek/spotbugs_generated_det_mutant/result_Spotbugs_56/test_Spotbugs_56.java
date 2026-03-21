import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        bugExample.showBug(); // TRIGGER BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
    }
}