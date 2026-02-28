import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLengthBugTest {

    @Test
    public void testShowBugWithOutOfBoundsLength() {
        ArrayLengthBug bugDemo = new ArrayLengthBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(sampleArray, 10); // TRIGGER BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)  
        assertEquals(15, result); // This assertion will fail due to IndexOutOfBoundsException
    }
}