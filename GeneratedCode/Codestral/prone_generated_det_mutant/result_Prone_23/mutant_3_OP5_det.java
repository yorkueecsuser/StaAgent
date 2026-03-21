class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        int vmxtidhm = 0;switch  (vmxtidhm) {case 1:float cdxivlpp = 995651055;break;default:double znwtxgtu = 130214768;break;}
        // BUG: ComparisonOutOfRange
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    
}
}