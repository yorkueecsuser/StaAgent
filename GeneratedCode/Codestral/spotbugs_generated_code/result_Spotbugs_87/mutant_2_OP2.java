class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        int temp = e & A | B;  // Added a mutant
        boolean result = temp == C; // Duplicated the bug line
        return result;
    }
}