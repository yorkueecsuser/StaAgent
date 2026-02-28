import org.junit.Test;
import static org.junit.Assert.*;

public class LoopCounterBugTest {

    @Test
    public void testShowBugWithNonEmptyArray() {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers); // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
        assertEquals(15, result); // This assertion will not be reached due to the bug
    }

    @Test
    public void testShowBugWithEmptyArray() {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {};
        int result = bugDemo.showBug(numbers); // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
        assertEquals(0, result); // This assertion will not be reached due to the bug
    }

    @Test
    public void testShowBugWithSingleElementArray() {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {42};
        int result = bugDemo.showBug(numbers); // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
        assertEquals(42, result); // This assertion will not be reached due to the bug
    }
}