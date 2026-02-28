class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        boolean unreachableCondition = getUnreachableCondition();
        while(unreachableCondition) {
            System.out.println("This is an unreachable loop");
        }
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }

    public boolean getUnreachableCondition() {
        return false;
    }
}