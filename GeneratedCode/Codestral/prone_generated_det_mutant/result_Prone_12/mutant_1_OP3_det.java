class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        if (true && true && true && true && true && false && true && true && false && false && false) {double axtdxtxm = -204899897;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}