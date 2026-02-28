class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        boolean result = value == Double.NaN;
        // Mutant: Duplication of the assignment statement
        boolean resultDuplicate = value == Double.NaN;
        return result;
        // Note: The duplicated line 'boolean resultDuplicate = value == Double.NaN;' does not affect the original code
                 // as it is not being used. However, it is added to demonstrate the mutant.
    }
}