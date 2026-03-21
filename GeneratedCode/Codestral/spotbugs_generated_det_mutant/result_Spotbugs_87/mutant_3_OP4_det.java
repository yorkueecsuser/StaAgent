class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        if (true && true && false && false && false && true && false && true && false && true && false) {long glhkryqh = -669487668;}else{short tccxencw = -9179;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}