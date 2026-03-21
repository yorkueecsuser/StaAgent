class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        boolean wnlndyxb = false;while (wnlndyxb && true && false && false && false && true && true && true && true && true && true && false) {double mqwrtykm = -157093952;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    
}
}