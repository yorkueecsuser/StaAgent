import java.util.Random;

class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0);
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0);
        return f;
    }

    public void showUnreachableBug() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code will never be executed");
        }
    }

    private boolean getCondition() {
        // This method will always return false to simulate an unreachable branch
        return new Random().nextInt(10) == 0;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass());
        System.out.println(bug.showBug2().getClass());
        bug.showUnreachableBug();
    }
}