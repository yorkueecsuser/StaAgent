class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        boolean nujobxfz = false;while (nujobxfz && true && false && false && true && false && true && true && true && true && true && false) {short jmexeifi = -5241;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}