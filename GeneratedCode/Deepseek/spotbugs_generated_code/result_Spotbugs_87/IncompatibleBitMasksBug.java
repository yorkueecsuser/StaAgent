class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        // Mutated code to introduce the bug
        return (e | A | B) == C; // Introducing a second use of bitwise OR operator instead of bitwise AND
    }
}