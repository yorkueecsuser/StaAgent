class BitwiseOperationBug {
    private static final int CONSTANT = -1;
    private boolean unreachableCondition() {
        return false;
    }

    public boolean showBug(int val) {
        // Unreachable if statement
        if (unreachableCondition()) {
            System.out.println("This line should never execute.");
        }

        // Bug: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    }
}