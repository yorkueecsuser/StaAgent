class IntCastToFloatBug {
    private boolean getCondition() {
        return false;
    }

    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Original bug: int value cast to float
        int roundedValue = Math.round(floatValue); // Original bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)

        // Mutation: Unreachable if-else statement
        if (getCondition()) { // The condition is always false to make the branch unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This branch is always executed due to the condition being false
            int alternativeValue = intValue * 2;
            return alternativeValue;
        }

        return roundedValue; // This line is unreachable in the original code, but it's required to compile the code
    }
}