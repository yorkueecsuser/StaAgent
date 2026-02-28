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
        boolean conditionFor = false; // Mutation: Unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop");
        }
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