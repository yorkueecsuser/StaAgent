import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleArrayComparisonTest {

    @Test
    public void testShowBugWithIncompatibleArrays() {
        IncompatibleArrayComparison demo = new IncompatibleArrayComparison();
        
        String[] stringArray = {"a", "b", "c"};
        int[] intArray = {1, 2, 3};
        
        // The test is expected to fail because the bug is triggered here
        boolean result = demo.showBug(stringArray, intArray); // TRIGGER BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
        assertFalse("The arrays should not be considered equal due to incompatible types.", result);
    }
}