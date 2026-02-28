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
     * Method to demonstrate the mutated bug, Unreachable switch statement.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String mutatedBug(int x) {
        boolean shouldRun = false;
        switch (x) {
            case 0:
                shouldRun = true;
                break;
            case 1:
                shouldRun = false;
                break;
            default:
                shouldRun = false;
                break;
        }

        if (!shouldRun) {
            return Integer.toString(x);
        }

        return new Integer(x).toString(); // Mutant: Unreachable switch statement
    }
}