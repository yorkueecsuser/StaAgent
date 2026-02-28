/**
 * Class demonstrating the UnnecessaryConversionTemporary bug with added unreachable while loop mutant.
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
     * Method to introduce an unreachable while loop mutant.
     */
    public void introduceUnreachableWhileLoopMutant() {
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop mutant.");
        }
    }
}