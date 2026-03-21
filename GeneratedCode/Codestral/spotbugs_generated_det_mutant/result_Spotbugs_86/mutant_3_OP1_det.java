class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        long tlpjvfpj = -540396375;
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    
}
}