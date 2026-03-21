class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        for  (int tsrxkevp = 0; tsrxkevp < 0; tsrxkevp++) {float fyyppypk = 488846277;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}