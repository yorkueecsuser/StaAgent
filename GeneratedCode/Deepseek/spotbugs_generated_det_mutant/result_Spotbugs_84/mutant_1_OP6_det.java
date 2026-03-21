class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        for  (int owknzapr = 0; owknzapr < 0; owknzapr++) {boolean olrcaduu = false;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}