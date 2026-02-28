import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    private BuggyCode bc = new BuggyCode();

    @Test
    public void testShowBug() {
        assertFalse(bc.showBug("one", "two"));  // TRIGGER BUG: UseEqualsToCompareStrings
        assertTrue(bc.showBug("one", "one"));   // TRIGGER BUG: UseEqualsToCompareStrings
        assertTrue(bc.showBug("two", "two"));   // TRIGGER BUG: UseEqualsToCompareStrings
    }
}