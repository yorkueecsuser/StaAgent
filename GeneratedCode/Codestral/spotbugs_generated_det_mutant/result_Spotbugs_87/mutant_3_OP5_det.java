class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        int labfpdgy = 0;switch  (labfpdgy) {case 1:float ndwzfbvv = -314622279;break;default:char ledymqdc = 'z';break;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}