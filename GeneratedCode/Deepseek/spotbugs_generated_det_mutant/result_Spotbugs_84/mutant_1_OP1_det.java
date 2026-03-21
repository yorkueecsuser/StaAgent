class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        long inbubjia = -604516491;
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}