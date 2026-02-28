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
     * Mutant method demonstrating the unreachable if statement bug.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String mutantShowBug(int x) {
        String foo = new Integer(x).toString(); // Mutant: Unreachable if statement
        boolean condition = false;
        if (condition) {
            return foo;
        }
        return "";
    }
}