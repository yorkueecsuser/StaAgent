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
        boolean djsytlxr = false;while (djsytlxr && false && true && true && false && true && false && false && true && false && false && false) {String zbgeduni = "zpybwgmb";}
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