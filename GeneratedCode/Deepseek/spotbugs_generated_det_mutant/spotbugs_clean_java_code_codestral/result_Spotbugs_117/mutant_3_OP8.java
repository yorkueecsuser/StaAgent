class IntCastToFloatBug {
    public int showBug(int initialValue) {
        float floatValue = (float) initialValue; // Bug: int value cast to float
        int roundedValue = Math.round(floatValue); // Renamed variable: roundedValue instead of floatValue
        return roundedValue; // Using the renamed variable
    }
}