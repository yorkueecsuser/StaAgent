class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        byte rsroytnt = 105;
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}