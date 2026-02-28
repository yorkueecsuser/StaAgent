class ConditionalExpressionNumericPromotionBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion

        // Mutant: Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This line should never be executed.");
        } else {
            // Do nothing, this branch is unreachable
        }

        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion

        // Mutant: Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This line should never be executed.");
        } else {
            // Do nothing, this branch is unreachable
        }

        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}