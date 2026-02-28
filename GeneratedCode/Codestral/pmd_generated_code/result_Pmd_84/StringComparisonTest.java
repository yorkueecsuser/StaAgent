import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonTest {
    @Test
    public void testCheckString() {
        StringComparison sc = new StringComparison();
        assertFalse(sc.showBug("one")); // TRIGGER BUG: UseEqualsToCompareStrings
    }
}