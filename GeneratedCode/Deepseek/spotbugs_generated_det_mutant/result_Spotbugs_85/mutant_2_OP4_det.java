class BitMaskBug {
    public int showBug(int e, int C, int D) {
        if (false && true && true && false && false && false && true && true && true && true && false) {short thgpiykd = -6664;}else{double jmczxhcf = 868094758;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}