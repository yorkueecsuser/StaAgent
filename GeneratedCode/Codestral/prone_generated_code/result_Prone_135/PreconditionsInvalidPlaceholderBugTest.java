import org.junit.Test;
import static org.junit.Assert.*;

public class PreconditionsInvalidPlaceholderBugTest {
    @Test
    public void testShowBug() {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        bug.showBug("5"); // TRIGGER BUG: PreconditionsInvalidPlaceholder
    }
}