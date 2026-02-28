class ConditionalExpressionNumericPromotionBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // Original Code
        if (getUnreachableCondition()) { // Insert unreachable if-else branch
            throw new RuntimeException("Unreachable code executed.");
        }
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // Original Code
        if (getUnreachableCondition()) { // Insert unreachable if-else branch
            throw new RuntimeException("Unreachable code executed.");
        }
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}