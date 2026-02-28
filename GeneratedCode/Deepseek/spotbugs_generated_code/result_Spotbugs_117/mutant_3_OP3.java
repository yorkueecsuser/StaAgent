class IntCastToFloatBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int intValue) {
        if (getFalseCondition()) { // Unreachable if statement
            System.out.println("This code should never be executed.");
        }

        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}