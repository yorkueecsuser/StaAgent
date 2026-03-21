import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperandBugTest {
    MathOperandBug bug = new MathOperandBug();

    @Test
    public void testShowBug1() {
        assertEquals(2f/3, bug.showBug1(), 0.0f); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug2() {
        assertEquals(1_000L*3_600*24*365, bug.showBug2(), 0L); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug3() {
        assertEquals((long)Integer.MAX_VALUE + 2, bug.showBug3(), 0L); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug4() {
        assertEquals((long)Integer.MIN_VALUE - 1, bug.showBug4(), 0L); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug6() {
        assertEquals((long)2147483647, bug.showBug6(100), 0L); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug7() {
        assertEquals(2147483647f, bug.showBug7(100), 0.0f); // TRIGGER BUG: Math operands should be cast before assignment
    }
}