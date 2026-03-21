class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        short tvjswytj = -9745;
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}