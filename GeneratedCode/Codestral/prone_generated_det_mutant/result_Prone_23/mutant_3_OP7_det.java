class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        boolean gcptyecn = false;while (gcptyecn && false && true && false && true && true && true && false && true && false && false && false) {char fufxmwrs = 'v';}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}