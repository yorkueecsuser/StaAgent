class NaNComparisonExample {

    /**
     * Demonstrates a comparison with NaN that will always return false.
     * The method compares the input value with Double.NaN using '==',
     * which is incorrect for checking if a value is NaN.
     *
     * @param value The double value to compare with NaN.
     * @return true if the comparison (incorrectly) considers the value as NaN.
     */
    public boolean showBug(double value) {
        boolean unreachableBranch = getUnreachableCondition(); // dynamically determined condition
        if (unreachableBranch) {
            return false; // unreachable code
        }
        return value == Double.NaN; // BUG: ComparisonWithNaN
    }

    /**
     * Demonstrates a comparison with NaN that will always return false.
     * The method compares the input value with Float.NaN using '=='.
     *
     * @param value The float value to compare with NaN.
     * @return true if the comparison (incorrectly) considers the value as NaN.
     */
    public boolean showBug(float value) {
        boolean unreachableBranch = getUnreachableCondition(); // dynamically determined condition
        if (unreachableBranch) {
            return false; // unreachable code
        }
        return value == Float.NaN; // BUG: ComparisonWithNaN
    }
    
    /**
     * Demonstrates a nonsensical comparison with NaN that will always return false.
     * The method compares the input value with Double.NaN using '<='.
     *
     * @param value The double value to compare with NaN.
     * @return true if the comparison (incorrectly) considers the value as less than or equal to NaN.
     */
    public boolean showBugWithInequality(double value) {
        boolean unreachableBranch = getUnreachableCondition(); // dynamically determined condition
        if (unreachableBranch) {
            return false; // unreachable code
        }
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }

    /**
     * This method provides a non-final dynamic condition for unreachable code.
     * The logic inside ensures it's always false for the purposes of these examples.
     * In reality, this could be more complex and change at runtime.
     *
     * @return false, to simulate an unreachable condition.
     */
    private boolean getUnreachableCondition() {
        return false; // In practice, this could be dynamic, but here it's false to simulate unreachable code.
    }
}