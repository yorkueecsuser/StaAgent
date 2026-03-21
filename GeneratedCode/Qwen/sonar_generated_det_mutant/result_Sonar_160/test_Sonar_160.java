import org.junit.Test;
import static org.junit.Assert.*;

public class IdenticalExpressionBugTest {

    private IdenticalExpressionBug bugDemo = new IdenticalExpressionBug();

    @Test
    public void testShowBug1() {
        assertFalse(bugDemo.showBug1(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug2() {
        assertTrue(bugDemo.showBug2(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug3() {
        assertFalse(bugDemo.showBug3(5, 10)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug4() {
        assertFalse(bugDemo.showBug4(5, 10)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug5() {
        assertEquals(0, bugDemo.showBug5(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug6() {
        assertEquals(1, bugDemo.showBug6(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug7() {
        assertFalse(bugDemo.showBug7(null)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug8() {
        assertEquals(0, bugDemo.showBug8(0)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }
}