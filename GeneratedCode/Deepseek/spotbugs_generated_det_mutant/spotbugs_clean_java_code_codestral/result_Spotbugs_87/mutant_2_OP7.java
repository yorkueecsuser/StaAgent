class IncompatibleBitMasksBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int e, int A, int B, int C) {
        while (getFalseCondition()) {
            // Unreachable code block
            int x = 10;
        }

        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }
}