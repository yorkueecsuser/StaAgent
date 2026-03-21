class BitMaskBug {
    public int showBug(int e, int C, int D) {
        for  (int xbrnjoom = 0; xbrnjoom < 0; xbrnjoom++) {short hjepqxty = -7594;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}