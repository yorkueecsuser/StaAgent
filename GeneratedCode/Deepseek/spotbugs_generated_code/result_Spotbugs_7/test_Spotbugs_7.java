import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionBugTest {

    @Test
    public void testShowBugTriggeringInfiniteRecursion() {
        InfiniteRecursionBug bug = new InfiniteRecursionBug();
        bug.showBug(); // TRIGGER BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }
}