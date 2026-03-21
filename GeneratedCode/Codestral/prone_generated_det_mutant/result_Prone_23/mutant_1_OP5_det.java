class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        int hhcmorrg = 0;switch  (hhcmorrg) {case 1:boolean qvybskxl = true;break;default:long ksxvxnzr = 79571014;break;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}