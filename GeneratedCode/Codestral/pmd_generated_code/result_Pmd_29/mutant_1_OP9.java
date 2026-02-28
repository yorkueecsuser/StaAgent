class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        // The below line is not a correct way to check for NaN, but it's a common mistake
        return value == Double.NaN;
    }
}