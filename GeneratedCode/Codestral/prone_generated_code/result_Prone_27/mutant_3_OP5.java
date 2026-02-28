class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion

        // Mutant: Unreachable switch statement
        boolean shouldNotRun = false;
        int value = getValue();
        if(shouldNotRun) {
            switch(value) {
                case 1:
                    // This code will never be executed
                    break;
                default:
                    // Handle default case if needed
            }
        }

        return t;
    }

    private int getValue() {
        // Implement a dynamic logic here which will never return 1
        return 0;
    }

    // Rest of the code...
}