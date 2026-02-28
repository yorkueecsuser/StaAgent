class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        byte v = value; // This line is added to rename the variable
        // BUG: ComparisonOutOfRange
        return v == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }
}