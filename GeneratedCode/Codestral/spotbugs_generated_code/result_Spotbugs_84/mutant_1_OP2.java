class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        int result = (val & CONSTANT);
        return ((result > 0) && (result > 0)); // Duplicated the line to introduce the bug
    }
}