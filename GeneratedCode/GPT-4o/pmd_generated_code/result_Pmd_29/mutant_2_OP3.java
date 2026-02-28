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
        boolean alwaysFalseCondition = isAlwaysFalse();
        if (alwaysFalseCondition) {
            System.out.println("This block is unreachable.");
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
        boolean alwaysFalseCondition = isAlwaysFalse();
        if (alwaysFalseCondition) {
            System.out.println("This block is unreachable.");
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
        boolean alwaysFalseCondition = isAlwaysFalse();
        if (alwaysFalseCondition) {
            System.out.println("This block is unreachable.");
        }
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }

    /**
     * Helper method to return a condition that is always false.
     * This ensures the if statement is unreachable.
     *
     * @return false
     */
    private boolean isAlwaysFalse() {
        return false;
    }
}