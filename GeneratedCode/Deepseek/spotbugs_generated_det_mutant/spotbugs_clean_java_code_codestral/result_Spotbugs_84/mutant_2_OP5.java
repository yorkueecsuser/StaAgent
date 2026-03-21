class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        if (val >= 0) { // Introducing a condition to make the switch statement unreachable
            int x = 0; // A non-final variable to use in the switch statement
            switch (x) {
                case 1:
                    return ((val & CONSTANT) > 0); // The original buggy code
                default:
                    break;
            }
        }
        return false; // Added to avoid reaching the end of a non-void method without a return value
    }
}