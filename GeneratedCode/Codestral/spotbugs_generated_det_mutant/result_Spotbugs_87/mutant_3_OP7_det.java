class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        boolean jgmhzqas = false;while (jgmhzqas && true && true && false && false && false && false && false && false && true && false && false) {int rrwezlos = 285319344;}
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    
}
}