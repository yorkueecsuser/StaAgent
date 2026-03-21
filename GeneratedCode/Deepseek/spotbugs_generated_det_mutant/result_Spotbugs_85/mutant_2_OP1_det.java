class BitMaskBug {
    public int showBug(int e, int C, int D) {
        byte pscrnyku = 96;
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}