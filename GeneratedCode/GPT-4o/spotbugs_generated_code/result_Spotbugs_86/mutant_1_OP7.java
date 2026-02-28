class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            // Unreachable while loop inserted here
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("This will never be printed");
            }
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    // Method to provide a runtime condition
    public boolean getCondition() {
        return false; // This is a runtime evaluated condition, not a compile-time constant
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}