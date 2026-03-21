import org.junit.Test;
import static org.junit.Assert.*;

public class IdenticalExpressionsBugTest {
    IdenticalExpressionsBug bug = new IdenticalExpressionsBug();

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug() {
        assertTrue(bug.showBug(1)); // line 19
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug1() {
        assertFalse(bug.showBug1(1, 2)); // line 31
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug2() {
        assertFalse(bug.showBug2(1, 2)); // line 43
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug3() {
        assertEquals(1, bug.showBug3(5)); // line 55
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug4() {
        assertEquals(0, bug.showBug4(5)); // line 67
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug5() {
        assertTrue(bug.showBug5(new Object())); // line 79
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug6() {
        assertFalse(bug.showBug6(Float.NaN)); // line 91
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug7() {
        assertEquals(2, bug.showBug7(1)); // line 103
    }

    @Test // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    public void testShowBug8() {
        assertEquals(10, bug.showBug8(1)); // line 115
    }
}