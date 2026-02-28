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
     * Demonstrates an unreachable switch statement.
     * This method contains a switch statement that is never reached.
     */
    public void demonstrateUnreachableSwitch() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            case 2:
                System.out.println("This is also unreachable.");
                break;
            default:
                System.out.println("Default case, still unreachable.");
                break;
        }
    }

    /**
     * Helper method to produce a value that makes the switch statement unreachable.
     * This method always returns 0, which doesn't match any case in the switch statement.
     *
     * @return An int value that makes the switch statement unreachable.
     */
    private int getUnreachableValue() {
        return 0; // This value is used to ensure the switch statement remains unreachable.
    }
}