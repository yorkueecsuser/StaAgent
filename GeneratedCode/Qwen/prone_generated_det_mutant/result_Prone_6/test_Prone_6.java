import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ArraysAsListPrimitiveArrayExampleTest {

    @Test
    public void testShowBug() {
        ArraysAsListPrimitiveArrayExample example = new ArraysAsListPrimitiveArrayExample();
        int[] array = {1, 2, 3};
        List<int[]> result = example.showBug(array); // TRIGGER BUG: ArraysAsListPrimitiveArray
        assertEquals(3, result.size()); // This assertion will fail because the size of the list is 1, not 3
    }
}