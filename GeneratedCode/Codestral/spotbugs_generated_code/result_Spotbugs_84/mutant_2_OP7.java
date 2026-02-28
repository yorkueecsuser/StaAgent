class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getCondition() { // added method for dynamic condition
        return false;
    }

    public boolean showBug(int val) {
        while (getCondition()) { // unreachable while loop
            System.out.println("Unreachable code");
        }

        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    }
}