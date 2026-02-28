class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original code
        boolean result = value == Double.NaN;

        // Added mutant code
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            throw new RuntimeException("This block is unreachable");
        }

        return result;
    }

    // Dummy method to simulate a dynamically determined condition
    private boolean getUnreachableCondition() {
        return false;
    }
}