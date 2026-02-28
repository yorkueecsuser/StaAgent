import org.junit.Test;
import static org.junit.Assert.*;

public class RangeArrayLengthBugTest {
    @Test
    public void testGetValues() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = RangeArrayLengthBug.getValues(arr, 10);
        assertEquals(arr.length, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(arr[i], result[i]);
        }
    }

    @Test
    public void testGetValuesOutOfBounds() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = RangeArrayLengthBug.getValues(arr, 10);
        assertEquals(arr.length, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(arr[i], result[i]);
        }
        // TRIGGER BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        result = RangeArrayLengthBug.getValues(arr, 11);
        assertEquals(arr.length, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(arr[i], result[i]);
        }
    }
}