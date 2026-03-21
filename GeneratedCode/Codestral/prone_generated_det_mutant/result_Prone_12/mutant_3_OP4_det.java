class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        if (false && false && false && false && false && false && false && false && true && false && false) {short wadcjvdm = -5937;}else{String arazpqee = "ozucdgym";}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}