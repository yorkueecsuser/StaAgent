class ConditionalExpressionNumericPromotionBug {

    private boolean getCondition() {
        return false; // Always returns false to ensure an unreachable switch statement
    }

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0);
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This line should never be executed.");
                break;
            default:
                break;
        }
        return t;
    }

    // Rest of the original code remains unchanged.
    //...
}