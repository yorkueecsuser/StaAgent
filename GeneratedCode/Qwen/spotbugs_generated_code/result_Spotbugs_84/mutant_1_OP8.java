class BitwiseOperationBug {

    public int showBug(int val) {
        int CONSTANT = -16; // Example negative constant
        boolean result = ((val & CONSTANT) > 0); // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return result? 1 : 0;

        // Mutated code with renaming
        int a = val; // Renamed variable
        int b = CONSTANT; // Renamed variable
        boolean c = ((a & b) > 0); // Renamed variable
        return c? 1 : 0; // Renamed variable
    }

    public static void main(String[] args) {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        System.out.println(bugDemo.showBug(16));  // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(-16)); // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(32));  // Expected to be 0 but might not be due to the bug

        // Mutated code with renaming
        BitwiseOperationBug x = new BitwiseOperationBug(); // Renamed variable
        System.out.println(x.showBug(16));  // Expected to be 0 but might not be due to the bug
        System.out.println(x.showBug(-16)); // Expected to be 0 but might not be due to the bug
        System.out.println(x.showBug(32));  // Expected to be 0 but might not be due to the bug
    }
}