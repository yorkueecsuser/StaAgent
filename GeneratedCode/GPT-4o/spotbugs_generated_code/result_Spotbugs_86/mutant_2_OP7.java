class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // Unreachable code block
                System.out.println("This will never print.");
            }
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    private boolean getUnreachableCondition() {
        return false; // The while loop will never execute
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}