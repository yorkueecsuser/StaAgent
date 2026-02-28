class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        
        // Inserting an unreachable while loop using a dynamically determined condition
        boolean isUnreachable = determineUnreachableCondition();
        while (isUnreachable) {
            // This block is unreachable
            System.out.println("This code will never be executed.");
        }
        
        return result;
    }
    
    private boolean determineUnreachableCondition() {
        // The condition is determined at runtime and returns false
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