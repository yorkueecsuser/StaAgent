import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayComparisonBugTest {

    @Test
    public void testShowBugWithDifferentArrays() {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        assertFalse(bugDemo.showBug(array1, array2)); // TRIGGER BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }

    @Test
    public void testShowBugWithSameReferenceArrays() {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] array1 = {1, 2, 3};
        int[] array3 = array1;

        assertTrue(bugDemo.showBug(array1, array3)); // TRIGGER BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }
}