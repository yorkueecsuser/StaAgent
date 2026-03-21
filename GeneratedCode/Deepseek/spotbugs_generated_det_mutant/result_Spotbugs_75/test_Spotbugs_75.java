import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        assertFalse(BuggyCode.showBug()); // TRIGGER BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}