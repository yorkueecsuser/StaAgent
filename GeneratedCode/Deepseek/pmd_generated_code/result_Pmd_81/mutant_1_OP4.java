/**
 * Class demonstrating the Unreachable if-else statement mutant.
 */
class UnreachableIfElseStatement {

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
     * Adding the mutant code here
     */
    public String unreachableIfElseStatementMutant(int x) {
        boolean shouldRun = false;
        if (shouldRun) {
            return new Integer(x).toString();
        } else {
            return "Unreachable code";
        }
    }
}