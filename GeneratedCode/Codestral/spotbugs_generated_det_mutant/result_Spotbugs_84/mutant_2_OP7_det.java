class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        boolean xuctopyw = false;while (xuctopyw && false && true && false && true && true && true && true && false && false && true && false) {float gqiefazv = 971791764;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    
}
}