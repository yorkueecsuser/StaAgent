class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        addUnreachableLoop(); // Added mutant
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        addUnreachableLoop(); // Added mutant
        return f;
    }

    private void addUnreachableLoop() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable due to the condition being always false
            System.out.println("This is an unreachable loop");
        }
    }

    private boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}