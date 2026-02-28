class DoubleBug {
    public double showBug(int value) {
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        long newValue = (long) value; // Mutant: Renaming the variable 'value' to 'newValue'
        return Double.longBitsToDouble(newValue);
    }
}