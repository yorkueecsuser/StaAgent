class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return result;
    }

    // Mutated Method
    public Object showBug_mutant(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object x = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return x;
    }

    public static void main(String[] args) {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        
        Object resultTrue = example.showBug(true);
        System.out.println("Result when flag is true: " + resultTrue.getClass());
        
        Object resultFalse = example.showBug(false);
        System.out.println("Result when flag is false: " + resultFalse.getClass());

        // Testing the mutant method
        Object mutantResultTrue = example.showBug_mutant(true);
        System.out.println("Mutant result when flag is true: " + mutantResultTrue.getClass());

        Object mutantResultFalse = example.showBug_mutant(false);
        System.out.println("Mutant result when flag is false: " + mutantResultFalse.getClass());
    }
}