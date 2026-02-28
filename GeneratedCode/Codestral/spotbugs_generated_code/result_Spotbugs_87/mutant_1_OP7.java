class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Original buggy code
        boolean loopCondition = false;
        while (loopCondition) {
            // This loop is unreachable
        }

        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }

    // A method to get a condition dynamically at runtime
    private boolean getCondition() {
        // Replace this with a dynamic condition based on your application's logic
        return false;
    }
}