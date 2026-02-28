class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            // Unreachable for loop mutation
            boolean conditionFor = isConditionMet();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is an unreachable for loop.");
            }
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    // Helper method to ensure loop condition is dynamically determined
    private boolean isConditionMet() {
        return false;
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}