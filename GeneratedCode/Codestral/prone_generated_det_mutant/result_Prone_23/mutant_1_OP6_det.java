class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        for  (int banxjhyw = 0; banxjhyw < 0; banxjhyw++) {byte yjpgvmaw = -62;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}