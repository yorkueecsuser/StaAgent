class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        boolean zfvjofto = false;while (zfvjofto && false && true && true && true && false && true && true && true && false && true && false) {float udgvwypm = 365287657;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}