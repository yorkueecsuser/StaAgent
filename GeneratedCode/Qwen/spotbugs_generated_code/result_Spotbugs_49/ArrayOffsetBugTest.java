import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOffsetBugTest {

    @Test
    public void testShowBugWithOutOfBoundsOffset() {
        ArrayOffsetBug bugDemo = new ArrayOffsetBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        // Triggering the bug by calling showBug with an offset equal to the array length
        bugDemo.showBug(sampleArray, 5); // TRIGGER BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET) 
    }
}