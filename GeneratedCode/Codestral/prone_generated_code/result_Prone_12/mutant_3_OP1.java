class BadShiftAmountBug {
    public int showBug(int number) {
        // Added dead store
        int deadStore = 0;

        // Original code
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    }
}