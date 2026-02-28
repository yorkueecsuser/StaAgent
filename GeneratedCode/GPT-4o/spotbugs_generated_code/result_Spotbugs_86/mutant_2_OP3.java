class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }

        // Mutation: Adding an unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line is unreachable due to false condition");
        }
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false; // This makes the if condition always false at runtime
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}