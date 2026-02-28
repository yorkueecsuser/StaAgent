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
     * Method to demonstrate the mutated bug.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String showMutantBug(int x) {
        boolean shouldRun = false;
        if (shouldRun) {
            String foo = new Integer(x).toString(); // Mutant: UnnecessaryConversionTemporary with Unreachable if-else statement
            return foo;
        } else {
            boolean shouldNotRun = true;
            return Integer.toString(x); // No bug here
        }
    }
}