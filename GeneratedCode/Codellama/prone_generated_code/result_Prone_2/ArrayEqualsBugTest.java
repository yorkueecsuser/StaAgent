import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayEqualsBugTest {
    @Test
    public void testArrayEquals() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        assertFalse(array1.equals(array2)); // TRIGGER BUG: ArrayEquals
    }
}