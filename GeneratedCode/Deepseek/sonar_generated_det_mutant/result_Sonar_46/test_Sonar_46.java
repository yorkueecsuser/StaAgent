import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        try {
            buggyCode.showBug();
        } catch (Error e) {
            // TRIGGER LINE: 29 (starting from 1)
            assertTrue(e.getMessage().contains("java.lang.AssertionError: BUG: Assertions comparing incompatible types should not be made"));
        }
    }
}