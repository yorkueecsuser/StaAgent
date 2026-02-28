class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);

        // Introduce a mutated unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This will always print.");
        }
    }
    
    // Method to ensure the condition is false at runtime
    public static boolean getFalseCondition() {
        return false;
    }
}