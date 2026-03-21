import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOutOfBoundsTest {
    private ArrayOutOfBounds aob = new ArrayOutOfBounds();

    @Test
    public void testShowBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        aob.showBug(numbers); // TRIGGER BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }
}