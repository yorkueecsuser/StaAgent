class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        // Mutation: Equivalent Loop Replacement
        // No loops in the code, so no mutation happens here.
        // The original bug is maintained.
        return value == Double.NaN;
    }
}