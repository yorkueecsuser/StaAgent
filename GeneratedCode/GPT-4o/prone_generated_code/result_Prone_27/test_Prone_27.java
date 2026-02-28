import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalExpressionExampleTest {
    
    @Test
    public void testShowBugTrue() {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        Object result = example.showBug(true); // TRIGGER BUG: ConditionalExpressionNumericPromotion
        assertEquals("Expected class to be Double", Double.class, result.getClass());
    }
    
    @Test
    public void testShowBugFalse() {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        Object result = example.showBug(false); // TRIGGER BUG: ConditionalExpressionNumericPromotion
        assertEquals("Expected class to be Integer", Integer.class, result.getClass());
    }
}