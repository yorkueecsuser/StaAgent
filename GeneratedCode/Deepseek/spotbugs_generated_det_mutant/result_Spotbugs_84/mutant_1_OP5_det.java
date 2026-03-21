class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        int xjswxalk = 0;switch  (xjswxalk) {case 1:float fqgzdqzy = 108140605;break;default:int gsakotyk = 705361048;break;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}