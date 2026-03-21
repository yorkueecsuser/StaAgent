class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Original bug: int value cast to float
        float duplicateFloatValue = floatValue; // Mutated code: duplicating the assignment statement
        return Math.round(floatValue); // Original bug: float value passed to Math.round
    }
}