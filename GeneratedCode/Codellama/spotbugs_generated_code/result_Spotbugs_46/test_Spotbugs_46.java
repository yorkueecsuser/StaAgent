import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldBugTest {
    @Test
    public void testBug() {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        bug.showBug();
        // TRIGGER BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    }
}