class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        if (true && true && false && true && true && false && true && false && false && false && false) {byte ocmytspv = 69;}else{byte zqoiylwa = 25;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    
}
}