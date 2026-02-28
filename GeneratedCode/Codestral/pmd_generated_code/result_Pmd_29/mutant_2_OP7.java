class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original Code
        boolean valueIsNaN = value == Double.NaN;

        // Mutant Code - Inserting an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop will never execute because unreachableCondition is always false
        }

        return valueIsNaN;
    }

    private boolean getUnreachableCondition() {
        // This method returns false to make the while loop unreachable
        return false;
    }
}