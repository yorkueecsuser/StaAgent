import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayComparisonBugTest {

    @Test
    public void testShowBugWithNonArrayObject() {
        ArrayComparisonBug example = new ArrayComparisonBug();
        int[] numbers = {1, 2, 3};
        String text = "Not an array";

        boolean result = example.showBug(numbers, text); // TRIGGER BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        assertFalse("Expected comparison to be false due to bug", result);
    }

    @Test
    public void testShowBugWithArrayObject() {
        ArrayComparisonBug example = new ArrayComparisonBug();
        int[] numbers = {1, 2, 3};
        Object[] arrayObject = {1, 2, 3};

        boolean result = example.showBug(numbers, arrayObject); // TRIGGER BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        assertFalse("Expected comparison to be false due to bug", result);
    }
}