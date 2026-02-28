class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        if (getUnreachableCondition()) {
            // Unreachable if-else statement
            System.out.println("This is an unreachable branch");
        } else {
            // BUG: BIT: Incompatible bit masks (BIT_IOR)
            return (e & A | B) == C; // This line should be (e & (A | B)) == C
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making this branch unreachable
    }
}