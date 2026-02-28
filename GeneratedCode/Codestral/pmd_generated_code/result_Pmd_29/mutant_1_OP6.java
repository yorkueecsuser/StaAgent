class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Inserted unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will never be executed
        }

        // Original code
        return value == Double.NaN;
    }

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }
}