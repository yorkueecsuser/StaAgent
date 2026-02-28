import org.junit.Test;
import static org.junit.Assert.*;

public class IfElseBugDemoTest {

    @Test
    public void testShowBugWithParam1() {
        IfElseBugDemo demo = new IfElseBugDemo();
        assertEquals("openWindow", demo.showBug(1)); // TRIGGER BUG: Related "if/else if" statements should not have the same condition
    }

    @Test
    public void testShowBugWithParam2() {
        IfElseBugDemo demo = new IfElseBugDemo();
        assertEquals("closeWindow", demo.showBug(2));
    }

    @Test
    public void testShowBugWithParam3() {
        IfElseBugDemo demo = new IfElseBugDemo();
        assertEquals("", demo.showBug(3));
    }
}