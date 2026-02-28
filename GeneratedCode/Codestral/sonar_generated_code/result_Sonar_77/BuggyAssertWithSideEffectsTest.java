import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BuggyAssertWithSideEffectsTest {

    @Test
    public void testShowBug() {
        BuggyAssertWithSideEffects buggyAssert = new BuggyAssertWithSideEffects();
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        assertTrue(buggyAssert.showBug(myList)); // TRIGGER BUG: Expressions used in "assert" should not produce side effects
        assertEquals(0, myList.size()); // This will fail because the element has been removed in the buggy method
    }
}