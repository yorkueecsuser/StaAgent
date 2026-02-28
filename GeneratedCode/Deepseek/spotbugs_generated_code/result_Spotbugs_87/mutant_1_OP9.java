class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        // Mutated code maintains the original bug
        return (e | A | B) == C; // Intentionally using bitwise OR instead of bitwise AND
    }
}