class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        if (false && true && false && false && false && true && false && true && true && false && false) {double xyqhqoug = -775251014;}else{String ayreslqw = "teaqjqmo";}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}