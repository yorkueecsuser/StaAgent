class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        for  (int ripkejil = 0; ripkejil < 0; ripkejil++) {short ietltyuc = -3575;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}