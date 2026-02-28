class BitwiseOperationBug {
    private static final int CONSTANT = -1;
    private static final int RENAMED_VAL = 0; // Mutant code

    public boolean showBug(int val) {
        RENAMED_VAL = val; // Mutant code
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((RENAMED_VAL & CONSTANT) > 0); // Mutant code
    }
}