class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        if (true && false && false && false && true && true && true && true && false && true && false) {byte gbgtfsql = 28;}else{char jnljiybr = 'm';}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}