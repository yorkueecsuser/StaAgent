class IntCastToFloatBug {
    public boolean getCondition() {
        return false;
    }

    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        int result = Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)

        // Mutation Operator: Unreachable if statement
        if (getCondition()) { // Using a method call to dynamically determine the condition
            System.out.println("This line should never be executed.");
        }

        return result;
    }
}