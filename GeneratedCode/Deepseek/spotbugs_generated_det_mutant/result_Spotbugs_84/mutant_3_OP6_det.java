class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        for  (int nkiktohi = 0; nkiktohi < 0; nkiktohi++) {boolean zfkwvffx = false;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}