import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ArrayCopyBugTest {

    @Test
    public void testShowBug1() {
        ArrayCopyBug arrayCopyBug = new ArrayCopyBug();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = arrayCopyBug.showBug1(input); // TRIGGER BUG: AvoidArrayLoops
        assertArrayEquals(expected, result);
    }

    @Test
    public void testShowBug2() {
        ArrayCopyBug arrayCopyBug = new ArrayCopyBug();
        int[] input = {6, 7, 8, 9, 10};
        int[] expected = {6, 7, 8, 9, 10};
        int[] result = arrayCopyBug.showBug2(input); // TRIGGER BUG: AvoidArrayLoops
        assertArrayEquals(expected, result);
    }

    @Test
    public void testShowBug3() {
        ArrayCopyBug arrayCopyBug = new ArrayCopyBug();
        int[] input = {11, 12, 13, 14, 15};
        int[] expected = {12, 13, 14, 15, 0};
        int[] result = arrayCopyBug.showBug3(input); // TRIGGER BUG: AvoidArrayLoops
        assertArrayEquals(expected, result);
    }
}