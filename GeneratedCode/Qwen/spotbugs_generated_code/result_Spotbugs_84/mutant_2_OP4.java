class BitwiseOperationBug {

    public int showBug(int val) {
        int CONSTANT = -16; // Example negative constant
        boolean result = ((val & CONSTANT) > 0); // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)

        // Mutated code: Adding an unreachable if-else statement
        boolean shouldRun = false; // This variable ensures the if-else block is unreachable
        if (shouldRun) {
            System.out.println("This will never be printed because shouldRun is false.");
        } else {
            System.out.println("This will also never be printed because the if block is unreachable.");
        }

        return result? 1 : 0;
    }

    public static void main(String[] args) {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        System.out.println(bugDemo.showBug(16));  // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(-16)); // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(32));  // Expected to be 0 but might not be due to the bug
    }
}