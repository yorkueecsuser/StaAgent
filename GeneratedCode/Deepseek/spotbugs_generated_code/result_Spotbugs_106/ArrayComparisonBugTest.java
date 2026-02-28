import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayComparisonBugTest {

    @Test
    public void testCompareArrays() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        ArrayComparisonBug bug = new ArrayComparisonBug();
        // TRIGGER BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        assertFalse(bug.showBug(array1, array2));
    }
}