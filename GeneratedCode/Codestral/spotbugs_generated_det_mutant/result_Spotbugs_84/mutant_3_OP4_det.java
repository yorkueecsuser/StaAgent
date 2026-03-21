class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        if (true && true && false && false && false && false && false && false && true && true && false) {byte awbkjxag = 113;}else{float vfuvzsjo = -823191459;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    
}
}