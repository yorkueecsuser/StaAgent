class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // Mutation Operator: Dead Store
        int unusedVariable = 0; // Added dead store variable

        return shiftedNumber;
    }
}