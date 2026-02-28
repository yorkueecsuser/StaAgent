class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        int unusedVariable = 10; // Dead store mutant
        return value == Double.NaN;
    }
}