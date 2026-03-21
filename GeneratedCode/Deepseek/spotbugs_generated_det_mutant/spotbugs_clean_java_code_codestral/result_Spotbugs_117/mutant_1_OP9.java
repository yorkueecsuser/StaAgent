class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }

    public void addEquivalentDoWhileLoop(int n) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < n);
    }
}