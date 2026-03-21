import org.junit.Test;
import static org.junit.Assert.*;

public class BugCodeTest {
    private BugCode bugCode = new BugCode();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        bugCode.showBug();  // This line triggers the bug
    }
}