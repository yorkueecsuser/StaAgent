class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        if (false && true && true && true && false && false && false && false && false && false && false) {double kqjjvoas = -598705239;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}