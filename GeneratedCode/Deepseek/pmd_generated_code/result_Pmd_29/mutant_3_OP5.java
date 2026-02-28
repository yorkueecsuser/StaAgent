class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    }

    public boolean showBugMutant(double someDouble) {
        // Mutation: Unreachable Switch Statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse? 1 : 0) {
            default:
                System.out.println("This code is unreachable.");
        }

        // Original Functionality:
        return (someDouble == Double.NaN);
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}