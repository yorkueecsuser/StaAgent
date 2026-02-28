class ConditionalExpressionExample {

    public Object showBug(boolean flag) {
        // When flag is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object result = flag ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return result;
    }

    // Mutant Code
    public Object showBugMutant(boolean f) {
        // When f is true, the expression evaluates to Double; when false, it evaluates to Integer.
        // However, due to numeric promotion, the result is always a Double.
        Object r = f ? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return r;
    }

    public static void main(String[] args) {
        ConditionalExpressionExample example = new ConditionalExpressionExample();
        
        Object resultTrue = example.showBug(true);
        System.out.println("Result when flag is true: " + resultTrue.getClass());
        
        Object resultFalse = example.showBug(false);
        System.out.println("Result when flag is false: " + resultFalse.getClass());

        // Mutant Code
        Object resultTrueMutant = example.showBugMutant(true);
        System.out.println("Mutant Result when flag is true: " + resultTrueMutant.getClass());
        
        Object resultFalseMutant = example.showBugMutant(false);
        System.out.println("Mutant Result when flag is false: " + resultFalseMutant.getClass());
    }
}