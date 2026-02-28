class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        
        // Mutation: Unreachable if statement
        // Introducing a non-final variable to simulate an unreachable if statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            // Unreachable code block
            System.out.println("This code is unreachable");
        }
        
        return result;
    }
    
    // Helper method to return a false condition
    private boolean getFalseCondition() {
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