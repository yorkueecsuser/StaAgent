class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        if (false && false && false && true && false && false && true && false && false && true && false) {byte jstsxnzr = -126;}else{int hjibtgft = -991347475;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}