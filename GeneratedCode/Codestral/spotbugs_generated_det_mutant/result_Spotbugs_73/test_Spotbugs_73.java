import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        boolean result = BuggyCode.showBug(); // TRIGGER BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        assertFalse(result);
    }
}