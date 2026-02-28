class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original code
        boolean originalResult = value == Double.NaN;

        // Mutant code
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code block is unreachable
            throw new RuntimeException("Unreachable code block executed");
        }

        return originalResult;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if condition unreachable
        return false;
    }
}