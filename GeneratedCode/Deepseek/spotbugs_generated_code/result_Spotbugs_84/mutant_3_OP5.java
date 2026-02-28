class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        if (getCondition()) {
            int switchCase = val & CONSTANT;
            switch (switchCase) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return ((val & CONSTANT) > 0);
    }
}