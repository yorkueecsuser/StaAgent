class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        if (false && true && true && false && false && false && true && true && false && false && false) {double lymmbtgq = 304477500;}else{byte gqzqrlvk = -57;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}