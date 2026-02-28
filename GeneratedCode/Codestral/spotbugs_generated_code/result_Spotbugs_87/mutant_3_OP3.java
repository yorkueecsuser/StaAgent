class IncompatibleBitMasksBug {
    private boolean getFalseCondition() {
        return false;  // Method to return a false condition
    }

    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        // Mutation Operator: Unreachable if statement
        if (getFalseCondition()) {
            // Unreachable if branch
            return (e & A | B) == C;
        }
        return (e & A | B) == C; // Should still maintain the original bug
    }
}