class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        int z = A; // Mutant addition: Renaming A to z
        return (e & z | B) == C; // Should still have the bug: (e & A | B) == C
    }
}