class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        int vsgtemod = 0;switch  (vsgtemod) {case 1:long jeyuvxpr = 485188127;break;default:float ypeuwgtf = 551346289;break;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}