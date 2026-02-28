class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        // Mutant: Unreachable while loop
        while (isConditionFalse()) {
            // This code will never be executed
        }
        return shiftedNumber;
    }

    private boolean isConditionFalse() {
        return false;
    }
}