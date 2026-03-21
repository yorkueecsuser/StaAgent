class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        if (false && false && true && false && true && true && false && true && true && true && false) {float cntksknm = -262115463;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}