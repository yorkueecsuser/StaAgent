class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Original bug
        int d = A | B; // Renaming A to d
        return (e & d) == C; // Using the renamed variable d
    }
}