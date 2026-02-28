import org.junit.Test;
import static org.junit.Assert.*;

public class IdentityBinaryExpressionExampleTest {

    @Test
    public void testShowBug1() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertFalse(example.showBug1(false)); // TRIGGER BUG: IdentityBinaryExpression
        assertTrue(example.showBug1(true)); // This should pass but is included for completeness
    }

    @Test
    public void testShowBug2() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug2(5)); // TRIGGER BUG: IdentityBinaryExpression
        assertTrue(example.showBug2(0)); // This should pass but is included for completeness
    }

    @Test
    public void testShowBug3() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertFalse(example.showBug3(5)); // TRIGGER BUG: IdentityBinaryExpression
        assertFalse(example.showBug3(0)); // This should pass but is included for completeness
    }

    @Test
    public void testShowBug4() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertEquals(1, example.showBug4(5)); // TRIGGER BUG: IdentityBinaryExpression
        // Note: Division by zero will throw ArithmeticException, but the test does not handle it as per requirements
    }

    @Test
    public void testShowBug5() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertEquals(0, example.showBug5(5)); // TRIGGER BUG: IdentityBinaryExpression
        // Note: Modulo by zero will throw ArithmeticException, but the test does not handle it as per requirements
    }

    @Test
    public void testShowBug6() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertEquals(0, example.showBug6(5)); // TRIGGER BUG: IdentityBinaryExpression
    }
}