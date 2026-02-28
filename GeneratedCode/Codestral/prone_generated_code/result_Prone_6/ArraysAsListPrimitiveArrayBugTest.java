import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class ArraysAsListPrimitiveArrayBugTest {

    @Test
    public void testShowBug() {
        ArraysAsListPrimitiveArrayBug bug = new ArraysAsListPrimitiveArrayBug();
        int[] array = {1, 2, 3, 4, 5};
        bug.showBug(array);
        // TRIGGER BUG: ArraysAsListPrimitiveArray
        List<int[]> list = Arrays.asList(array);
        assertEquals(1, list.size());
        assertArrayEquals(array, list.get(0));
    }
}