class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        if (false && false && false && true && false && false && false && true && false && true && false) {double vojenhfi = -735993483;}else{byte tokdvsgp = -126;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}