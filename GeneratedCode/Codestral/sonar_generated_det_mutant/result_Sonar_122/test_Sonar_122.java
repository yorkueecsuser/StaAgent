import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionBugTest {
    @Test
    public void testShowBug() {
        InfiniteRecursionBug bug = new InfiniteRecursionBug();
        bug.showBug(); // TRIGGER BUG: Recursion should not be infinite
    }
}