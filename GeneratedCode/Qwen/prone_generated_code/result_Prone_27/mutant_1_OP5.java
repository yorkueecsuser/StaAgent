class ConditionalExpressionBug {

    public Object showBug() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(t.getClass());  // class java.lang.Double

        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(f.getClass());  // class java.lang.Double

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() always returns false
                System.out.println("This will never be printed");
                break;
            default:
                // Default case to ensure switch is not empty and compilable
                break;
        }

        return new Object[]{t, f};
    }

    private boolean getCondition() {
        // Always returns false to ensure the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}