class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if (false && false && false && true && true && false && true && false && false && true && false) {String exaksflm = "dfbqxmdd";}
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    
}
}