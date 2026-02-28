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
        // Unreachable for loop
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
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
        // Unreachable for loop
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
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
        // Unreachable for loop
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
        }
        
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }
    
    // This method returns a boolean value to be used as a non-final condition
    private boolean getCondition() {
        return false; // Always returns false, making the loop condition false at runtime
    }
}