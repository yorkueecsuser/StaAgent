class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int val) {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable Code");
        }
        // Original Bug: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    }
}