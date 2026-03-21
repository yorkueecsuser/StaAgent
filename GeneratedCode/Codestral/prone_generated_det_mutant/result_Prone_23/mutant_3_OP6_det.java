class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        for  (int earyzlxh = 0; earyzlxh < 0; earyzlxh++) {short ihuqtqys = -6789;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}