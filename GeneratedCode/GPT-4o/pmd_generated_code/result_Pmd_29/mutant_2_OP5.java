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
        // Unreachable switch statement
        int exampleSwitchValue = getExampleSwitchValue(); // Dynamically determined value
        switch (exampleSwitchValue) {
            case 99: // Unreachable case
                System.out.println("This should never be executed.");
                break;
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
        // Unreachable switch statement
        int exampleSwitchValue = getExampleSwitchValue(); // Dynamically determined value
        switch (exampleSwitchValue) {
            case 99: // Unreachable case
                System.out.println("This should never be executed.");
                break;
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
        // Unreachable switch statement
        int exampleSwitchValue = getExampleSwitchValue(); // Dynamically determined value
        switch (exampleSwitchValue) {
            case 99: // Unreachable case
                System.out.println("This should never be executed.");
                break;
        }
        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }

    // Method to get a value for switch statement that will never match the case
    private int getExampleSwitchValue() {
        return 0; // Always returns 0, case 99 is unreachable
    }
}