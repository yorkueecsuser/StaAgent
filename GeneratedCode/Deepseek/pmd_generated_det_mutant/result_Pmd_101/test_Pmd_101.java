import org.junit.Test;
import static org.junit.Assert.*;

public class ScratchTest {
    Scratch s = new Scratch();

    @Test
    public void testCopy_a_to_b() {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = s.showBug1(a);
        assertArrayEquals(a, b); // TRIGGER BUG: AvoidArrayLoops
    }

    @Test
    public void testShift_left() {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        s.shift_left(a);
        assertArrayEquals(expected, a); // TRIGGER BUG: AvoidArrayLoops
    }

    @Test
    public void testShift_right() {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        s.shift_right(a);
        assertArrayEquals(expected, a); // TRIGGER BUG: AvoidArrayLoops
    }
}