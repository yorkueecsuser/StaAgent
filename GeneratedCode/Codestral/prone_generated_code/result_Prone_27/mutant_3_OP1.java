import java.lang.Double;
import java.lang.Integer;

class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        int xyzabcde = 5; // Dead Store Mutation
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return t;
    }

    public Object showBug2() {
        int fghijklm = 10; // Dead Store Mutation
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}