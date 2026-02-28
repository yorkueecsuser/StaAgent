class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Insert unreachable if statement
        if (getFalseCondition()) {
            throw new RuntimeException("Unreachable code");
        }

        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }

    private boolean getFalseCondition() {
        // Dynamic condition that always evaluates to false
        return false;
    }
}