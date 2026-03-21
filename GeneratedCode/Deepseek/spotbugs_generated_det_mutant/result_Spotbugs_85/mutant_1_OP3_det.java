class BitMaskBug {
    public int showBug(int e, int C, int D) {
        if (true && false && false && false && false && false && true && true && false && true && false) {byte gupcnevh = 101;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}