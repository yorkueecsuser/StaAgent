class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        boolean qhjlqxpb = false;while (qhjlqxpb && false && true && true && true && false && false && false && false && false && false && false) {byte lhckijbb = 107;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}