import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidArrayLoopsTest {
    @Test
    public void testArrayCopy() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // TRIGGER BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        assertArrayEquals(arr1, arr2);
    }

    @Test
    public void testArrayCopyRange() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // TRIGGER BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        assertArrayEquals(arr1, arr2);
    }

    @Test
    public void testArrayCopyMoveElements() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // TRIGGER BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        assertArrayEquals(arr1, arr2);
    }
}