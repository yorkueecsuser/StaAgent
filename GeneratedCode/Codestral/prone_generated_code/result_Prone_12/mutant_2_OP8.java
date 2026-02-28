class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        int z = shiftedNumber; // Mutant: Renamed'shiftedNumber' to 'z'
        return z; // Return 'z' instead of'shiftedNumber'
    }
}