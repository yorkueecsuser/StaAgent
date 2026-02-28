import org.junit.Test;
import static org.junit.Assert.*;

public class LoopBugExampleTest {

    @Test
    public void testShowBugWithMultipleElements() {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = example.showBug(numbers); // TRIGGER BUG: Loops with at most one iteration should be refactored
        assertEquals(15, result); // Expecting the sum of all elements, but the bug will cause this to fail.
    }

    @Test
    public void testShowBugWithSingleElement() {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {10};
        int result = example.showBug(numbers); // TRIGGER BUG: Loops with at most one iteration should be refactored
        assertEquals(10, result); // This should pass as there's only one element, thus the bug doesn't affect this test.
    }
}