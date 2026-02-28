import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteLoopDemoTest {

    @Test
    public void testShowBug1() {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        demo.showBug1(); // TRIGGER BUG: Loops should not be infinite
    }

    @Test
    public void testShowBug2() {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        demo.showBug2(); // TRIGGER BUG: Loops should not be infinite
    }

    @Test
    public void testShowBug3() {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        demo.showBug3(); // TRIGGER BUG: Loops should not be infinite
    }
}