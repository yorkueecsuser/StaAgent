import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOutOfBoundsBugTest {

    @Test
    public void testShowBugWithInvalidOffset() {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset); // TRIGGER BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}