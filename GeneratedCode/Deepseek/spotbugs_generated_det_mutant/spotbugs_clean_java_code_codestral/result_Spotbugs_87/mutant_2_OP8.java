class IncompatibleBitMasksBug {
    public boolean showBug(int x, int A, int B, int C) {
        // Original buggy code
        return (x & A | B) == C; // Should be (x & (A | B)) == C

        // Mutated code
        int y = x;
        return (y & A | B) == C;
    }
}