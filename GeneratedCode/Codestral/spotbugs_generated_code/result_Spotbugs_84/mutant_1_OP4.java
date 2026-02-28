class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        } else {
            return ((val & CONSTANT) > 0);
        }
    }
}