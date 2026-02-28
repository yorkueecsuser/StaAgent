class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code block is unreachable.");
        }

        return result;
    }
    
    // Method to simulate dynamic condition checking
    private boolean getCondition() {
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