import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AssertBugTest {
    @Test
    public void testShowBug() {
        AssertBug bug = new AssertBug();
        List<Integer> myList = bug.showBug();
        // TRIGGER BUG: Expressions used in "assert" should not produce side effects
        assertTrue(myList.isEmpty());
    }
}