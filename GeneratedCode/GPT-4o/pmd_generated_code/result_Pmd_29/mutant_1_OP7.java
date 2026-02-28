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
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is unreachable while loop for showBug(double)");
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
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is unreachable while loop for showBug(float)");
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
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is unreachable while loop for showBugWithInequality(double)");
        }
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }
    
    /**
     * Returns a condition that is always false, used to simulate an unreachable while loop.
     * 
     * @return false to ensure the while loop is never entered
     */
    private boolean getUnreachableCondition() {
        return false;
    }
}