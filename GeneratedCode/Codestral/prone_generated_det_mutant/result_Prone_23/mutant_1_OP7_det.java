class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        boolean nuqcxktr = false;while (nuqcxktr && true && false && true && true && true && false && true && false && true && true && false) {int gsapifzm = 625954782;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}