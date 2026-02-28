/**
 * Class demonstrating the UnnecessaryConversionTemporary bug.
 */
class UnnecessaryConversionTemporaryBug {

    /**
     * Method to demonstrate the bug.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String showBug(int x) {
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    }

    /**
     * Method to demonstrate the correct way to convert an int to String.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String correctConversion(int x) {
        return Integer.toString(x); // No bug here
    }

    /**
     * Mutant code for the Unreachable While Loop mutation operator.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String unreachableWhileLoopMutant(int x) {
        boolean conditionWhile = false; // Non-final variable to avoid compile time constant
        while (conditionWhile) { // Unreachable while loop, condition is always false
            conditionWhile = true;
        }
        String foo = new Integer(x).toString(); // Original code (same as the buggy method)
        return foo;
    }
}