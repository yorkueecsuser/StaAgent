class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float

        // Mutant: Unreachable switch statement
        boolean shouldSkip = true;
        switch (shouldSkip? 1 : intValue) {
            case 2:
                System.out.println("This code will never be executed.");
                break;
        }

        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }
}