import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteLoopExampleTest {

    @Test
    public void testShowBug() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug(); // TRIGGER BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        fail("This line should never be reached due to the infinite loop."); // This ensures the test fails if the loop ever terminates
    }
}