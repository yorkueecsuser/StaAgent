class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        boolean tvuvxnnn = true;
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}