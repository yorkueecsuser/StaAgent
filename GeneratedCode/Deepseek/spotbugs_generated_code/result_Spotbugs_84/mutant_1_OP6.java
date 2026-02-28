class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        boolean condition = false; // Using non-final variable to avoid unreachable statement error
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This line will never be executed.");
        }
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    }
}