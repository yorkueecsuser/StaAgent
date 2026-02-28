class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Renaming variable 'value' to 'v'
        double v = value;
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return v == Double.NaN;
    }
}