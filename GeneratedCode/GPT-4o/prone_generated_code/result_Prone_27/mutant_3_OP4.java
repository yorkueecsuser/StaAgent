class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion

        // Unreachable if-else branch mutation
        boolean neverTrue = isConditionMet(); // Use a dynamically determined condition
        if (neverTrue) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Continuing execution.");
        }

        return result;
    }

    // This method simulates a condition that is always false for mutation purposes
    private boolean isConditionMet() {
        return false;
    }

    public static void main(String[] args) {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        
        Object resultTrue = example.showBug(true);
        System.out.println("Result when flag is true: " + resultTrue.getClass());
        
        Object resultFalse = example.showBug(false);
        System.out.println("Result when flag is false: " + resultFalse.getClass());
    }
}