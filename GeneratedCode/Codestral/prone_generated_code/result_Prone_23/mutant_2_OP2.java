class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)

        // Mutated code
        // Applying Duplication Mutation Operator
        value = 200; // Duplicating the assignment statement and inserting it immediately after its current location
        return value == 200; // This will now always return true, regardless of the original value
    }
}