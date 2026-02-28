class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int val) {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line should never be executed");
        }

        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    }
}