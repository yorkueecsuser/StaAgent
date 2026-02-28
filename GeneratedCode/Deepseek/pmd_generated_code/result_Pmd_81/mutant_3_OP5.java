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
     * Method to introduce a mutant that follows the mutation operator Unreachable switch statement.
     * @param x the integer to be converted to String
     * @return the string representation of the integer
     */
    public String mutant(int x) {
        String foo = new Integer(x).toString();
        boolean unreachable = false;
        switch (new Integer(0)) {
            case 1:
                foo = "Unreachable";
                break;
            default:
                break;
        }
        if (unreachable) {
            foo = "Unreachable";
        }
        return foo;
    }
}