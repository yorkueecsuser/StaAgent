import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteLoopExampleTest {

    @Test(expected = AssertionError.class)
    public void testShowBug1() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug1(); // TRIGGER BUG: Loops should not be infinite
    }

    @Test(expected = AssertionError.class)
    public void testShowBug2() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug2(); // TRIGGER BUG: Loops should not be infinite
    }

    @Test(expected = AssertionError.class)
    public void testShowBug3() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug3(); // TRIGGER BUG: Loops should not be infinite
    }

    @Test(expected = AssertionError.class)
    public void testShowBug() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        int result = example.showBug(); // TRIGGER BUG: Loops should not be infinite
        assertEquals(0, result); // This assertion will never be reached due to the infinite loop
    }
}