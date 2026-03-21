class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        for  (int pdddxfar = 0; pdddxfar < 0; pdddxfar++) {double psuerpxo = -252939066;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}