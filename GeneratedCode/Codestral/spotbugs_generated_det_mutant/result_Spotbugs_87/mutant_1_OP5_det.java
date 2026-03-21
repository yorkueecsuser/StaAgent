class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        int nwbtgwsw = 0;switch  (nwbtgwsw) {case 1:int bpqmskeb = -567536674;break;default:byte unztnlli = -12;break;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}