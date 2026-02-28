class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        while (getCondition()) { // Unreachable while loop mutation
            int x = 1;  // Dummy statement to avoid empty block error
        }
        return ((val & CONSTANT) > 0);
    }
}