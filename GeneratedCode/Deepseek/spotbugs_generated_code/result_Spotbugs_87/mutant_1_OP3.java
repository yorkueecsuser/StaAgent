class IncompatibleBitMasksBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int e, int A, int B, int C) {
        // Original code
        return (e & A | B) == C; // Should be (e & (A | B)) == C

        // Mutant code - Unreachable if statement
        if (getCondition()) {
            System.out.println("Unreachable code");
        }
    }
}