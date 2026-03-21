class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        for  (int ggcrngqn = 0; ggcrngqn < 0; ggcrngqn++) {byte tftgigcu = -116;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}