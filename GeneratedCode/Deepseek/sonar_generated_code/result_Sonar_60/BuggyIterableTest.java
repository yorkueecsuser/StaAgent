import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIterableTest {
    @Test // TRIGGER BUG: "iterator" should not return "this"
    public void testBuggyIterable() {
        BuggyIterable buggy = new BuggyIterable();
        assertEquals(3, buggy.showBug1().size()); // Expected: [1, 2, 3], Actual: [1, 2, 3]
        assertEquals(0, buggy.showBug2().size()); // Expected: [], Actual: []
    }
}