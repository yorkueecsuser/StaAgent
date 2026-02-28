import org.junit.Test;
import static org.junit.Assert.*;

public class ReferenceComparisonBugTest {

    @Test
    public void testShowBugWithSameValueDifferentReferences() {
        ReferenceComparisonBug bugDemo = new ReferenceComparisonBug();
        Integer num1 = 1000; // This will not be cached and will have different references
        Integer num2 = 1000; // This will not be cached and will have different references

        assertFalse(bugDemo.showBug(num1, num2)); // TRIGGER BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    }

    @Test
    public void testShowBugWithCachedValues() {
        ReferenceComparisonBug bugDemo = new ReferenceComparisonBug();
        Integer num1 = 100; // This will be cached and may have the same reference
        Integer num2 = 100; // This will be cached and may have the same reference

        assertTrue(bugDemo.showBug(num1, num2)); // TRIGGER BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    }
}