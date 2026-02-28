import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLengthBugDemoTest {

    @Test
    public void testShowBugArrayLengthOutOfBounds() {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayLengthBugDemo.showBug(numbers, 10); // TRIGGER BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
    }
}