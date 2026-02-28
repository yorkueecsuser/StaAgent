import org.junit.Test;
import static org.junit.Assert.*;

public class RangeArrayOffsetTest {
    @Test
    public void testBugTrigger() {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        System.out.println(arr[index]); // TRIGGER BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}