class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        // Original code
        boolean result = value == Double.NaN;

        // Mutant code - duplication of the assignment statement
        result = value == Double.NaN;

        return result;
    }
}