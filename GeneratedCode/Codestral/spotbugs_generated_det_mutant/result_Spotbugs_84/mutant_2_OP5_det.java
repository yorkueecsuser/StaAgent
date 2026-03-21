class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        int xjcdfksg = 0;switch  (xjcdfksg) {case 1:double zjquhtww = -131103700;break;default:String psjinahu = "mkptudgd";break;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    
}
}