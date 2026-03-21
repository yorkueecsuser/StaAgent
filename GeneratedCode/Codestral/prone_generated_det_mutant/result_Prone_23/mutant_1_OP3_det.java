class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        if (false && false && false && true && true && true && true && false && true && true && false) {String jtginahq = "fwbshpmd";}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}