import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionSelfComparisonTest {

    @Test
    public void testShowBugTriggersSelfComparison() {
        AssertionSelfComparison comparison = new AssertionSelfComparison();
        Object obj = new Object();
        
        boolean result = comparison.showBug(obj); // TRIGGER BUG: Assertions should not compare an object to itself
        assertFalse("The bug should cause this test to fail", result);
    }
}