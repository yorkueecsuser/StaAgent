class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        for  (int tolddnrh = 0; tolddnrh < 0; tolddnrh++) {boolean vjsrqhpu = true;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}