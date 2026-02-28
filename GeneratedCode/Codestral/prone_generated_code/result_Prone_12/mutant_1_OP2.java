class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        int duplicateShiftedNumber = number >> 32; // Duplicated assignment statement
        return shiftedNumber;
    }
}