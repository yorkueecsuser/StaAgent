import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysAsListPrimitiveArrayTest {
    @Test
    public void testBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> list = Arrays.asList(numbers); // TRIGGER BUG: ArraysAsListPrimitiveArray
        assertEquals(1, list.size());
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, (int[]) list.get(0));
    }

    public void showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> list = Arrays.asList(numbers); // TRIGGER BUG: ArraysAsListPrimitiveArray
        assertEquals(1, list.size());
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, (int[]) list.get(0));
    }
}