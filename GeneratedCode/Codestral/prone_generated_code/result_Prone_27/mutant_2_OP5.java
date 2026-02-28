class ConditionalExpressionNumericPromotionBug {

    private static int getUnreachableValue() {
        return 1;
    }

    public Object showBug1() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 2:
                System.out.println("This line should never be executed.");
                break;
            default:
                // Original code
                Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
                return t;
        }
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}