class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        byte v = value; // Added: Renamed the variable 'value' to 'v'
        // BUG: ComparisonOutOfRange
        return v == 200; // Updated: Comparison using the new variable name
    }
}