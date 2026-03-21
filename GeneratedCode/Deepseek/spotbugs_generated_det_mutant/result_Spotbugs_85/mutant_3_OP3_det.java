class BitMaskBug {
    public int showBug(int e, int C, int D) {
        if (true && false && true && false && false && false && false && false && false && true && false) {int qzylkzdq = 840035218;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}