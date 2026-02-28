class IntCastToFloatBug {
    private boolean getFalseCondition() {
        return false; // Returns a false condition to make the switch statement unreachable
    }

    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        int result = Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)

        // Mutation Operator: Unreachable switch statement
        int unreachableValue = 1; // This value will never be matched in the switch case
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            switch(unreachableValue) {
                case 1:
                    System.out.println("This statement is unreachable.");
                    break;
                default:
                    System.out.println("This is a default case for the unreachable switch statement.");
                    break;
            }
        }
        return result;
    }
}