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
        boolean conditionFor = getCondition(); // To ensure the loop is unreachable
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop body
            System.out.println("This loop is unreachable"); // Unique content
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
        boolean conditionFor = getCondition(); // To ensure the loop is unreachable
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop body
            System.out.println("This loop is unreachable"); // Unique content
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
        boolean conditionFor = getCondition(); // To ensure the loop is unreachable
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop body
            System.out.println("This loop is unreachable"); // Unique content
        }
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }
    
    private boolean getCondition() {
        return false; // Method to ensure the loop is unreachable
    }
}