import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorBugDemoTest {

    @Test
    public void testShowBug1() {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        int result = demo.showBug1(); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(-1, result);
    }

    @Test
    public void testShowBug2() {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        int result = demo.showBug2(); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(-2, result);
    }

    @Test
    public void testShowBug3() {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        int result = demo.showBug3(); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(2, result);
    }

    @Test
    public void testShowBug4() {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        boolean result = demo.showBug4(); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertTrue(result);
    }

    @Test
    public void testShowBug5() {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        int result = demo.showBug5(); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(2, result);
    }

    @Test
    public void testShowBug6() {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        int result = demo.showBug6(); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(1, result);
    }
}