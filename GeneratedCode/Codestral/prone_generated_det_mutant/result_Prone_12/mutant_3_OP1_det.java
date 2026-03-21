class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int ieotoyxt = -131644979;
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}