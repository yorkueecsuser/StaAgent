import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalExpressionBugTest {

    @Test
    public void testShowBugTrueCase() {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        Object[] result = (Object[]) bugDemo.showBug(); // TRIGGER BUG: ConditionalExpressionNumericPromotion
        assertEquals(Integer.class, result[0].getClass());
    }

    @Test
    public void testShowBugFalseCase() {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        Object[] result = (Object[]) bugDemo.showBug(); // TRIGGER BUG: ConditionalExpressionNumericPromotion
        assertEquals(Double.class, result[1].getClass());
    }
}