class BitwiseOperationBug {
    private static final int CONSTANT = -1;
    private static final int MUTANT_CONSTANT = -2; // Mutant added

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    }

    public boolean showMutantBug(int val) {
        // Mutant: Renaming of variable CONSTANT to MUTANT_CONSTANT
        return ((val & MUTANT_CONSTANT) > 0);
    }
}