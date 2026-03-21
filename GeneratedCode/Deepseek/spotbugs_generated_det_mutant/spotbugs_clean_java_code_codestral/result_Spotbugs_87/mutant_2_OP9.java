class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Original buggy line
    }

    public boolean showMutant(int e, int A, int B, int C) {
        // MUTANT: Replacing the buggy line with the incorrect bitwise operation as per the bug description
        return (e | A | B) == C; // Should be (e & (A | B)) == C
    }
}