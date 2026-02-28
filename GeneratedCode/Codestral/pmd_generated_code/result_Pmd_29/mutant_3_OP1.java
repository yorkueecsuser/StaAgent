class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        int deadStore = 0; // Dead Store mutation: adding an unused int variable
        return value == Double.NaN;
    }
}