class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        if (false && true && false && true && true && true && false && false && false && false && false) {int iaactnbu = -721961679;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}