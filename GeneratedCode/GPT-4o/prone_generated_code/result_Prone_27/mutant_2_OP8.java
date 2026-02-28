class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return result;
    }

    // Mutant Code: Renaming variable `result` to `x`
    public Object showBugMutant(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object x = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return x;
    }

    public static void main(String[] args) {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        
        Object resultTrue = example.showBug(true);
        System.out.println("Result when flag is true: " + resultTrue.getClass());

        // Invoke mutant method
        Object mutantResultTrue = example.showBugMutant(true);
        System.out.println("Mutant Result when flag is true: " + mutantResultTrue.getClass());
        
        Object resultFalse = example.showBug(false);
        System.out.println("Result when flag is false: " + resultFalse.getClass());

        // Invoke mutant method
        Object mutantResultFalse = example.showBugMutant(false);
        System.out.println("Mutant Result when flag is false: " + mutantResultFalse.getClass());
    }
}