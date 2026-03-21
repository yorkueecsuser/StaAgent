import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteLoopBugTest {
    @Test
    // TRIGGER BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
    public void testShowBug() {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        // This line will trigger the infinite loop
        ilb.showBug();
    }
}