class ConditionalExpressionNumericPromotionBug {

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug1() {
        // Insert an unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("Unreachable for loop in showBug1");
        }

        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return t;
    }

    // The rest of the code remains the same
    //...
}