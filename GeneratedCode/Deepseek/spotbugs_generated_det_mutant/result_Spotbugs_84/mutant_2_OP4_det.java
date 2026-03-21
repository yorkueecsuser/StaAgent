class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        if (false && false && true && false && false && true && false && true && false && true && false) {int vyqjuedo = -411446630;}else{boolean vhaiheaf = false;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}