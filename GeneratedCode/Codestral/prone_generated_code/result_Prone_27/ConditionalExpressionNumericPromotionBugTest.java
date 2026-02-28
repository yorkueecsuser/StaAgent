import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalExpressionNumericPromotionBugTest {

    @Test
    public void testShowBug1() {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        assertEquals(Double.class, bug.showBug1().getClass()); // TRIGGER BUG: ConditionalExpressionNumericPromotion
    }

    @Test
    public void testShowBug2() {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        assertEquals(Integer.class, bug.showBug2().getClass()); // TRIGGER BUG: ConditionalExpressionNumericPromotion
    }
}