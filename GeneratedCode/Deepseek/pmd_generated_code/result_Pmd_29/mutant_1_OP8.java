class NaNComparisonBug {
    private double someOtherDouble;

    public NaNComparisonBug() {
      this.someOtherDouble = Double.NaN;
    }

    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        // Mutation Operator: Renaming
        // Mutated Variable: someDouble -> someOtherDouble
        return (someOtherDouble == Double.NaN);
    }
}