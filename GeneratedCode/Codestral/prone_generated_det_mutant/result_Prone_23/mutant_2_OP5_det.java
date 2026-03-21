class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        int tsylzwah = 0;switch  (tsylzwah) {case 1:float yabgcxjw = 11411971;break;default:boolean bjzwmdmy = false;break;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}