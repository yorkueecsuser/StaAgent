import org.junit.Test;
import static org.junit.Assert.*;

public class ScratchTest {
    @Test
    public void testCopy_a_to_b() {
        Scratch scratch = new Scratch();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        scratch.copy_a_to_b(a, b);  // TRIGGER BUG: AvoidArrayLoops
        assertArrayEquals(a, b);  // This should fail because the bug in copy_a_to_b() didn't copy elements correctly
    }

    @Test
    public void testShowBug() {
        Scratch scratch = new Scratch();
        scratch.showBug();  // This test should fail because of the bug in copy_a_to_b()
    }
}