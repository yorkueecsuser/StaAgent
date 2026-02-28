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
        // Unreachable if statement mutant
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable");
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
        // Unreachable if statement mutant
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable");
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
        // Unreachable if statement mutant
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable");
        }
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }

    // This method provides a condition that is always false but not as a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }
}