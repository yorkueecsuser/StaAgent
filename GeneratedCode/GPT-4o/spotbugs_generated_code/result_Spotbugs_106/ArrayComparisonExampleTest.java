import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayComparisonExampleTest {

    @Test
    public void testShowBugDifferentArrays() {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        boolean result = example.showBug(arr1, arr2); // TRIGGER BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        assertFalse("Arrays with different contents should not be equal", result);
    }

    @Test
    public void testShowBugSameContentsDifferentReference() {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean result = example.showBug(arr1, arr2); // TRIGGER BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        assertTrue("Arrays with same contents should be equal", result);
    }
}