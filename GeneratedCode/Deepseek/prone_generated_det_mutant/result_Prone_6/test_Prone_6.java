import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListPrimitiveArrayTest {
    ArraysAsListPrimitiveArray obj = new ArraysAsListPrimitiveArray();

    @Test
    public void testShowBug() {
        int[] array = new int[]{1, 2, 3};
        List<int[]> list = obj.showBug(array);
        assertFalse(list.contains(array)); // TRIGGER BUG: ArraysAsListPrimitiveArray
    }
}