import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorBugTest {

    @Test
    public void testShowBug1() {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        int result = bugDemo.showBug1(1); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(-1, result); // Expecting -1; bug causes incorrect logic
    }

    @Test
    public void testShowBug2() {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        int result = bugDemo.showBug2(1); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(-1, result); // Expecting ~1; bug causes incorrect logic
    }

    @Test
    public void testShowBug3() {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        int result = bugDemo.showBug3(1); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(1, result); // Expecting 1; bug causes incorrect logic
    }

    @Test
    public void testShowBug4() {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        boolean result = bugDemo.showBug4(false); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertFalse(result); // Expecting false; bug causes incorrect logic
    }

    @Test
    public void testShowBug5() {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        int result = bugDemo.showBug5(1); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(3, result); // Expecting 3; bug causes incorrect logic
    }

    @Test
    public void testShowBug6() {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        int result = bugDemo.showBug6(1); // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(0, result); // Expecting 0; bug causes incorrect logic
    }
}