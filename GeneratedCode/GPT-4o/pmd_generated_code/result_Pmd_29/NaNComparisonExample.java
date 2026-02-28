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
        // Unreachable while loop added
        boolean conditionWhile = getFalseCondition(); 
        while (conditionWhile) {
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
        // Unreachable while loop added
        boolean conditionWhile = getFalseCondition(); 
        while (conditionWhile) {
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
        // Unreachable while loop added
        boolean conditionWhile = getFalseCondition(); 
        while (conditionWhile) {
            System.out.println("This block is unreachable.");
        }

        return value <= Double.NaN; // BUG: ComparisonWithNaN
    }

    /**
     * Method to provide a false condition for the unreachable while loop.
     * @return false
     */
    private boolean getFalseCondition() {
        return false;
    }
}