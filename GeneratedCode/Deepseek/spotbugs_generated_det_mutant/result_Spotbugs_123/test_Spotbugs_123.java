import org.junit.Test;
import static org.junit.Assert.*;

public class BugInstanceofTest {
    BugInstanceof bugInstanceof = new BugInstanceof();

    @Test
    public void testShowBug() {
        bugInstanceof.showBug(); // TRIGGER BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
}