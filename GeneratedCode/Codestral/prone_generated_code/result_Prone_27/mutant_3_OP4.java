class ConditionalExpressionNumericPromotionBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0);
        if (getFalseCondition()) {
            // Unreachable if-else branch added
            System.out.println("This statement is unreachable.");
        } else {
            // Empty else block to avoid unreachable statement error
        }
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0);
        if (getFalseCondition()) {
            // Unreachable if-else branch added
            System.out.println("This statement is unreachable.");
        } else {
            // Empty else block to avoid unreachable statement error
        }
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass());
        System.out.println(bug.showBug2().getClass());
    }
}