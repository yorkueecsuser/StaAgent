import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyAssertionTest {
    @Test
    public void testShowBug() {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        Object obj = new Object();
        boolean result = buggyAssertion.showBug(obj);
        assertFalse(result); // TRIGGER BUG: Assertions should not compare an object to itself
    }
}