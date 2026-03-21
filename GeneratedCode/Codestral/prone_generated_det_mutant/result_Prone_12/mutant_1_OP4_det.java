class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        if (false && false && false && true && true && true && true && true && false && true && false) {String eijsgzsr = "bglmrhzg";}else{float echutirh = -802975784;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}