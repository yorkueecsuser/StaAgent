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
        boolean condition = getUnreachableCondition();
        if (condition) { 
            // Unreachable branch
            return false; 
        } else {
            return value == Double.NaN; // BUG: ComparisonWithNaN
        }
    }

    /**
     * Demonstrates a comparison with NaN that will always return false.
     * The method compares the input value with Float.NaN using '=='.
     *
     * @param value The float value to compare with NaN.
     * @return true if the comparison (incorrectly) considers the value as NaN.
     */
    public boolean showBug(float value) {
        boolean condition = getUnreachableCondition();
        if (condition) { 
            // Unreachable branch
            return false; 
        } else {
            return value == Float.NaN; // BUG: ComparisonWithNaN
        }
    }
    
    /**
     * Demonstrates a nonsensical comparison with NaN that will always return false.
     * The method compares the input value with Double.NaN using '<='.
     *
     * @param value The double value to compare with NaN.
     * @return true if the comparison (incorrectly) considers the value as less than or equal to NaN.
     */
    public boolean showBugWithInequality(double value) {
        boolean condition = getUnreachableCondition();
        if (condition) { 
            // Unreachable branch
            return false; 
        } else {
            return value <= Double.NaN; // BUG: ComparisonWithNaN
        }
    }

    /**
     * This method emulates a condition that will never be true.
     * It is used to create an unreachable branch in the code.
     * 
     * @return false always.
     */
    private boolean getUnreachableCondition() {
        return false; // The condition is false, making the if-branch unreachable.
    }
}