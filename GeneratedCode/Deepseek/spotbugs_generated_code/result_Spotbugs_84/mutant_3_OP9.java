class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ((val & CONSTANT) > 0);
    }

    // Mutated code
    public boolean mutatedShowBug(int val) {
        // This is a mutated version of the showBug method. It maintains the original bug.
        return ((val & CONSTANT)!= 0);
    }
}