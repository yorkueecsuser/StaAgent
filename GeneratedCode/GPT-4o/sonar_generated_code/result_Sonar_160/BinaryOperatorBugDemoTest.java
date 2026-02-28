import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryOperatorBugDemoTest {

    @Test
    public void testShowBug1() {
        BinaryOperatorBugDemo demo = new BinaryOperatorBugDemo();
        assertFalse(demo.showBug1(5, 5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug2() {
        BinaryOperatorBugDemo demo = new BinaryOperatorBugDemo();
        assertTrue(demo.showBug2(5, 5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug3() {
        BinaryOperatorBugDemo demo = new BinaryOperatorBugDemo();
        assertFalse(demo.showBug3(5, 5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug4() {
        BinaryOperatorBugDemo demo = new BinaryOperatorBugDemo();
        assertFalse(demo.showBug4(5, 5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug5() {
        BinaryOperatorBugDemo demo = new BinaryOperatorBugDemo();
        assertNotEquals(1, demo.showBug5()); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug6() {
        BinaryOperatorBugDemo demo = new BinaryOperatorBugDemo();
        assertNotEquals(0, demo.showBug6()); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug7() {
        BinaryOperatorBugDemo demo = new BinaryOperatorBugDemo();
        assertFalse(demo.showBug7("test")); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }
}