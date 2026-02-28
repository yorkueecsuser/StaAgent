class ConditionalExpressionNumericPromotionBug {

    private boolean getUnreachableCondition() {
        // Assume this method is implemented to always return false
        return false;
    }

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0);

        if (getUnreachableCondition()) {
            // Unreachable if statement
            System.out.println("This line should never be executed.");
        }

        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0);

        if (getUnreachableCondition()) {
            // Unreachable if statement
            System.out.println("This line should never be executed.");
        }

        return f;
    }

    // rest of the code unchanged
}