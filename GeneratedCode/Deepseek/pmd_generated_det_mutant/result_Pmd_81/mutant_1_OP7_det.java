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
        boolean iwlalsuk = false;while (iwlalsuk && true && true && true && false && false && true && true && false && false && false && false) {double slrkdndi = -168313981;}
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
}