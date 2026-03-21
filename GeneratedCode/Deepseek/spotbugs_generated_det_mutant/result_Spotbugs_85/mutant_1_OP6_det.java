class BitMaskBug {
    public int showBug(int e, int C, int D) {
        for  (int bqoeyzff = 0; bqoeyzff < 0; bqoeyzff++) {char ulsibflt = 'x';}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}