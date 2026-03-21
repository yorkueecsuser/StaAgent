class BitMaskBug {
    public int showBug(int e, int C, int D) {
        boolean hhphlhia = false;while (hhphlhia && true && true && false && true && false && false && true && false && false && true && false) {byte vhgjijhu = -74;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}