import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorBugTest {

    @Test
    public void testShowBug1() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        assertEquals(-1, bug.showBug1(1)); // TRIGGER BUG: Unary prefix operators should not be repeated
    }

    @Test
    public void testShowBug2() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        assertEquals(-1, bug.showBug2(1)); // TRIGGER BUG: Unary prefix operators should not be repeated
    }

    @Test
    public void testShowBug3() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        assertEquals(1, bug.showBug3(1)); // TRIGGER BUG: Unary prefix operators should not be repeated
    }

    @Test
    public void testShowBug4() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        assertFalse(bug.showBug4(false)); // TRIGGER BUG: Unary prefix operators should not be repeated
    }

    @Test
    public void testShowBug5() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        assertEquals(1, bug.showBug5(1)); // TRIGGER BUG: Unary prefix operators should not be repeated
    }

    @Test
    public void testShowBug6() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        assertEquals(1, bug.showBug6(1)); // TRIGGER BUG: Unary prefix operators should not be repeated
    }

    @Test
    public void testShowBug() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        assertEquals(-1 + (-1) + 1 + 1 + 1 + 1, bug.showBug(1)); // TRIGGER BUG: Unary prefix operators should not be repeated
    }
}