class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        boolean result = value == Double.NaN;
        // Mutant - Duplication of the assignment statement
        boolean duplicateResult = value == Double.NaN;
        return result;
    }
}