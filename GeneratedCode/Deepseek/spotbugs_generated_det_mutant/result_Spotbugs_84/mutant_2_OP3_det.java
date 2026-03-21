class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        if (false && true && true && false && true && true && false && false && true && false && false) {long rhfmbkig = -555788522;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}