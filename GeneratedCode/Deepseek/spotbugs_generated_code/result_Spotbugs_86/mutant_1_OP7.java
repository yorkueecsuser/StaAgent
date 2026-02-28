class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            while (getUnreachableCondition()) { // Mutated code: Unreachable while loop
                // This code will never be executed
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This condition will always be false, making the loop unreachable
    }
}