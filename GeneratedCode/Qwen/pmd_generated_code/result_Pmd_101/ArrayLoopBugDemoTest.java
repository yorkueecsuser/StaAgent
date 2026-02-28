import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLoopBugDemoTest {

    @Test
    public void testShowBug1() {
        ArrayLoopBugDemo demo = new ArrayLoopBugDemo();
        int[] source = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = demo.showBug1(source); // TRIGGER BUG: AvoidArrayLoops
        assertArrayEquals(expected, result);
    }

    @Test
    public void testShowBug2() {
        ArrayLoopBugDemo demo = new ArrayLoopBugDemo();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 5};
        int[] result = demo.showBug2(array); // TRIGGER BUG: AvoidArrayLoops
        assertArrayEquals(expected, result);
    }

    @Test
    public void testShowBug3() {
        ArrayLoopBugDemo demo = new ArrayLoopBugDemo();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 1, 2, 3, 4};
        int[] result = demo.showBug3(array); // TRIGGER BUG: AvoidArrayLoops
        assertArrayEquals(expected, result);
    }
}