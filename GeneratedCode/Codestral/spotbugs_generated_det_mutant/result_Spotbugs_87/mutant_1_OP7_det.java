class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        boolean gczcckih = false;while (gczcckih && false && true && false && true && false && false && false && true && false && true && false) {char bgzfhksh = 'z';}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}