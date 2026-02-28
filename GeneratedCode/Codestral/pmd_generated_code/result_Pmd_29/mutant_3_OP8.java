class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        double nanValue = Double.NaN;
        return value == nanValue;
    }

    // Mutant Code
    public boolean showMutant(double v) {
        // Renaming Mutation
        double nanV = Double.NaN;
        return v == nanV;
    }
}