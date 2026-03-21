import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteLoopExampleTest {

    @Test
    public void testShowBug1() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug1(); // TRIGGER BUG: Loops should not be infinite
        fail("Expected to fail due to infinite loop in showBug1");
    }

    @Test
    public void testShowBug2() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug2(); // TRIGGER BUG: Loops should not be infinite
        fail("Expected to fail due to infinite loop in showBug2");
    }

    @Test
    public void testShowBug3() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug3(); // TRIGGER BUG: Loops should not be infinite
        fail("Expected to fail due to infinite loop in showBug3");
    }
}