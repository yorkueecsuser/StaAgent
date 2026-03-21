class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        boolean jzfgftuf = false;while (jzfgftuf && false && true && true && false && false && false && false && false && false && true && false) {byte ampyghvs = -38;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}