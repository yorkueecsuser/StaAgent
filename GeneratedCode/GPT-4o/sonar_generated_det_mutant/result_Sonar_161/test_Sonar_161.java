import org.junit.Test;
import static org.junit.Assert.*;

public class LoopBugExampleTest {

    @Test
    public void testShowBug() {
        LoopBugExample example = new LoopBugExample();
        
        int[] singleElementArray = {10};
        int result = example.showBug(singleElementArray);
        assertEquals(10, result); // TRIGGER BUG: Loops with at most one iteration should be refactored
        
        int[] emptyArray = {};
        result = example.showBug(emptyArray);
        assertEquals(0, result); // TRIGGER BUG: Loops with at most one iteration should be refactored
        
        int[] multiElementArray = {5, 15, 25};
        result = example.showBug(multiElementArray);
        assertEquals(5, result); // TRIGGER BUG: Loops with at most one iteration should be refactored
    }
}