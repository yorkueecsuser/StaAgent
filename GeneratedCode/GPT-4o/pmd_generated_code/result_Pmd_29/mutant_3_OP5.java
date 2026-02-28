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
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }

    /**
     * Inserts an unreachable switch statement as a mutation.
     */
    public void addUnreachableSwitch() {
        int dynamicValue = getDynamicValue();
        switch (dynamicValue) {
            case 1:
                System.out.println("This will never execute because dynamicValue is set to 0");
                break;
            default:
                // No operation
                break;
        }
    }

    /**
     * Method to simulate a dynamic value for the switch statement.
     * Always returns 0 to ensure the switch case 1 is unreachable.
     *
     * @return a fixed integer
     */
    private int getDynamicValue() {
        return 0;
    }
}