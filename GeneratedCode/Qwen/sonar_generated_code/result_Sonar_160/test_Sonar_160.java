import org.junit.Test;
import static org.junit.Assert.*;

public class IdenticalExpressionsBugTest {

    private IdenticalExpressionsBug bugInstance = new IdenticalExpressionsBug();

    @Test
    public void testShowBug1() {
        assertFalse(bugInstance.showBug1(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug2() {
        assertFalse(bugInstance.showBug2(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug3() {
        assertTrue(bugInstance.showBug3(5, 5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug4() {
        assertTrue(bugInstance.showBug4(5, 5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug5() {
        assertEquals(1, bugInstance.showBug5(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug6() {
        assertEquals(0, bugInstance.showBug6(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug7() {
        assertTrue(bugInstance.showBug7(new Object())); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug8() {
        assertEquals(0, bugInstance.showBug8(1)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }
}