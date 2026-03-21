class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        for  (int hvyitcts = 0; hvyitcts < 0; hvyitcts++) {short oeqsxxpi = 3973;}
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    
}
}