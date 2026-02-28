class ConditionalExpressionBug {

    public Object showBug() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(t.getClass());  // class java.lang.Double

        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(f.getClass());  // class java.lang.Double

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement");
        }

        return new Object[]{t, f};
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}