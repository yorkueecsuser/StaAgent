import org.junit.Test;
import static org.junit.Assert.*;

public class IdentityBinaryExpressionExampleTest {

    @Test
    public void testShowBug1() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug1(true)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug2() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug2(false)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug3() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug3(true)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug4() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug4(false)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug5() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug5(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug6() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertFalse(example.showBug6(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug7() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug7(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug8() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertFalse(example.showBug8(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug9() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertFalse(example.showBug9(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug10() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug10(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug11() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertEquals(0, example.showBug11(0)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug12() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertEquals(1, example.showBug12(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug13() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertEquals(1, example.showBug13(1)); // TRIGGER BUG: IdentityBinaryExpression
    }
    
    @Test
    public void testShowBug14() {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        assertTrue(example.showBug14(true)); // TRIGGER BUG: IdentityBinaryExpression
    }
}