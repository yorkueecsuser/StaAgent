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
        int ylmvcbet = 0;switch  (ylmvcbet) {case 1:float obfjoejc = 581966689;break;default:float btavjfxb = 622750875;break;}
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