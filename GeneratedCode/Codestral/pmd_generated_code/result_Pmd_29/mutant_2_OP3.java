class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original code
        boolean isNaN = value == Double.NaN;

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        return isNaN;
    }

    // Helper method to return a false condition dynamically at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}