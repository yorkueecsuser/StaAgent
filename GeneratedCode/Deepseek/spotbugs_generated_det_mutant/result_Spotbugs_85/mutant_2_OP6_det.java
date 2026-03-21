class BitMaskBug {
    public int showBug(int e, int C, int D) {
        for  (int gzxhmstg = 0; gzxhmstg < 0; gzxhmstg++) {byte xzrbeytg = 73;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}