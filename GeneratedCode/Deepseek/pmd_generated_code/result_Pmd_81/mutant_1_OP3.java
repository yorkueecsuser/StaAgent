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
    
    public boolean getCondition() {
        return false;
    }
    
    public int getValue() {
        return 0;
    }
    
    public void showMutant() {
        boolean condition = getCondition();
        int value = getValue();
        if (condition) {
            // do nothing
        }
        while (condition) {
            // do nothing
        }
        for (int i = 0; condition; i++) {
            // do nothing
        }
        if (true) {
            // do nothing
        } else {
            // do nothing
        }
        switch(value) {
            case 1:
                // do nothing
                break;
        }
    }
}