class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        
        // Mutation: Introducing an unreachable if-else statement
        boolean condition = getCondition(); // Dynamically determine the condition
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the else branch.");
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        
        Object resultTrue = example.showBug(true);
        System.out.println("Result when flag is true: " + resultTrue.getClass());
        
        Object resultFalse = example.showBug(false);
        System.out.println("Result when flag is false: " + resultFalse.getClass());
    }
}