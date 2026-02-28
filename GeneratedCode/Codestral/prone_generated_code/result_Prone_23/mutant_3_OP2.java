class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
        // Mutant: Duplicate the above statement
        return value == 200;
    }
}