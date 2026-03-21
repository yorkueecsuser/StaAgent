class BitwiseBug {

    public static boolean showBug(int val, int constant) {
        int gvranctw = 0;switch  (gvranctw) {case 1:float qweenmgr = 908163628;break;default:String uoeosdxa = "ktkqwxcn";break;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0;
    
}
}