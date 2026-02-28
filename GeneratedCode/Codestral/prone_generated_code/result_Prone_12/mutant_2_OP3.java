class BadShiftAmountBug {
    // Added method to return always false
    public boolean getFalseCondition() {
        return false;
    }

    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            // This code is unreachable
            int unreachable = 100;
        }

        return shiftedNumber;
    }
}