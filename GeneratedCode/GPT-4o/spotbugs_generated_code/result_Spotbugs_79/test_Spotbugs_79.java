import org.junit.Test;
import static org.junit.Assert.*;

public class IntLongComparisonTest {

    @Test
    public void testShowBugWithLongOutsideIntRange() {
        IntLongComparison obj = new IntLongComparison();
        int testInt = 123456789;
        long testLong = 123456789123L; // A long constant outside the int range
        boolean result = obj.showBug(testInt, testLong); // TRIGGER BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        assertFalse("Comparison should be false as the long constant is outside int range", result);
    }

    @Test
    public void testShowBugWithEqualValues() {
        IntLongComparison obj = new IntLongComparison();
        int testInt = 123456789;
        long testLong = 123456789L; // Within the int range and equal to testInt
        boolean result = obj.showBug(testInt, testLong); // Control test to ensure equality works
        assertTrue("Comparison should be true as values are equal and within range", result);
    }

    @Test
    public void testShowBugWithLongWithinIntRangeButDifferentValue() {
        IntLongComparison obj = new IntLongComparison();
        int testInt = 123456789;
        long testLong = 987654321L; // Within int range but different
        boolean result = obj.showBug(testInt, testLong); // TRIGGER BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        assertFalse("Comparison should be false as the long constant, though within range, is a different value", result);
    }
}