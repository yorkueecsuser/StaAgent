class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        if (getFalseCondition()) {
            // Unreachable if-else statement mutation
            return false;
        } else {
            return (e & A | B) == C; // Should be (e & (A | B)) == C
        }
    }

    private boolean getFalseCondition() {
        // Always returns false to make the if block unreachable
        return false;
    }
}