class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        if (false && false && false && false && true && false && true && true && true && true && false) {double beksiouo = 418898230;}else{float nmrxuhyc = 880864801;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}