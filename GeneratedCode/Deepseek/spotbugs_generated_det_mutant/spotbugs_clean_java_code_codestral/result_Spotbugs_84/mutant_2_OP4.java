class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        boolean unreachableCondition = falseMethod(); // Using unreachable condition
        if (unreachableCondition) {
            // Unreachable code
            return ((val & CONSTANT) > 0);
        } else {
            // Original code remains unchanged
            return ((val & CONSTANT) > 0);
        }
    }

    private boolean falseMethod() {
        return false;
    }
}