/**
 * Class demonstrating the UnnecessaryConversionTemporary bug and its mutant.
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
     * Mutant method to demonstrate the UnnecessaryConversionTemporary bug.
     * This method introduces an unreachable if-else branch into a randomly selected basic block in the program.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String mutant(int x) {
        String foo;
        if (false) { // mutant condition
            foo = new Integer(x).toString(); // this is the same as the original bug
        } else {
            foo = "mutant"; // mutant code
        }
        return foo;
    }
}