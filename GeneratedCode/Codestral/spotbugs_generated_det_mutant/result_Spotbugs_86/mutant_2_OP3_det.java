class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if (false && true && false && false && false && true && false && false && false && true && false) {byte dgsftdfs = 97;}
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    
}
}