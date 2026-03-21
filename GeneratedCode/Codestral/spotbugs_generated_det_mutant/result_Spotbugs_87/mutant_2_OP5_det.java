class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        int nptuuhye = 0;switch  (nptuuhye) {case 1:short tgnnzntf = -2551;break;default:float zjcmnsrn = 409096423;break;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}