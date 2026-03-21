class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        int esvpmnwg = 0;switch  (esvpmnwg) {case 1:long bxzrkzko = 617596430;break;default:int xqxvbcgu = 81437147;break;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    
}
}