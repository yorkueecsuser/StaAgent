class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line is unreachable.");
        } else {
            return (e & A | B) == C; // Should be (e & (A | B)) == C
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}