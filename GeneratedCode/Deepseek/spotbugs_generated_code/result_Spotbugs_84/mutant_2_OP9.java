class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // Original code
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        boolean originalBug = ((val & CONSTANT) > 0);

        // Mutant code: Equivalent Loop Replacement
        int i = 0;
        do {
            i++;
        } while (i < 1 && originalBug);

        return originalBug;
    }
}