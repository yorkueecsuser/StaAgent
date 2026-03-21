import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsExampleTest {

    @Test
    public void testShowBugWithOutOfBoundsIndex() {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        assertEquals(4, example.showBug(sampleArray, 3)); // TRIGGER BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }
}