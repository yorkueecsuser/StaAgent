class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }

        // Mutation: Introduced an unreachable if-else statement
        boolean condition = getFalseCondition(); // Using a method to avoid compile-time constant

        if (condition) {
            System.out.println("Unreachable code block");
        } else {
            System.out.println("This is also unreachable");
        }
    }

    private boolean getFalseCondition() {
        return false; // This method returns false to ensure the branches are unreachable
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}