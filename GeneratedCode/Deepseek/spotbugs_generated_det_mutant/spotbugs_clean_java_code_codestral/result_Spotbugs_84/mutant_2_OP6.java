class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);

        // Mutated code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
    }

    // Helper method to return a condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}