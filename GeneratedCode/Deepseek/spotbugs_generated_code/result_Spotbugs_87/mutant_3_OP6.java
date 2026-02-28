class IncompatibleBitMasksBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        for (int i = 0; getCondition(); i++) {
            // Unreachable loop
        }
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }
}