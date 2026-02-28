import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        bugExample.showBug(); // TRIGGER BUG: AvoidInstanceofChecksInCatchClause
    }
}