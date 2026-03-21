class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if (true && false && false && false && true && false && false && true && true && true && false) {int ahohfixp = -987048817;}
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    
}
}