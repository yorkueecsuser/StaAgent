import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsExampleTest {

    @Test
    public void testShowBugWithStandardArray() {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] numbers = {1, 2, 3, 4, 5};
        
        example.showBug(numbers); // TRIGGER BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }
}