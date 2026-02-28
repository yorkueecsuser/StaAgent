class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C

        // Mutant code added here
        return (e & A | B) == C; // Duplicated return statement
    }
}