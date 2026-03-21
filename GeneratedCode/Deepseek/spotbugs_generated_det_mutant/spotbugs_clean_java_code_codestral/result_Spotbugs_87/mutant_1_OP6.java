class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Unreachable for loop mutation
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code, does not affect the original functionality
            System.out.println("This loop is unreachable.");
        }

        // Original code with the bug
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }
}