class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        int unreachableValue = -1; // a value that will never be reached in the switch
        switch (unreachableValue) {
            case 0:
                System.out.println("This should never be printed.");
                break;
        }
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}