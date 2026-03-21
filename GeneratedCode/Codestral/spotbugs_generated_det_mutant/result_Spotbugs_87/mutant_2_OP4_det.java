class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        if (true && true && false && true && false && false && true && true && false && true && false) {boolean xzzkfiaa = true;}else{short hgtgdmuv = -5834;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}