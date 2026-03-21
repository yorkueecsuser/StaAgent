import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOffsetBugExampleTest {

    @Test
    public void testShowBugWithOutOfBoundsOffset() {
        int[] exampleArray = {1, 2, 3, 4, 5};
        // This call should trigger an IndexOutOfBoundsException
        int result = ArrayOffsetBugExample.showBug(exampleArray, 10); // TRIGGER BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}