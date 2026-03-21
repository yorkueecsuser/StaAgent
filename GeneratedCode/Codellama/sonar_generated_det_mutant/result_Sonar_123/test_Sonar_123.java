import org.junit.Test;
import static org.junit.Assert.*;

class InfiniteLoopBugTest {
    @Test
    void testInfiniteLoop() {
        InfiniteLoopBug i = new InfiniteLoopBug();
        i.infiniteLoop();
        // TRIGGER BUG: Loops should not be infinite
        fail("Expected an infinite loop to be triggered");
    }
}