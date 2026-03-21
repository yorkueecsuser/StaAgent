class ShiftBug {
    public int showBug(int num) {
        int xchqrqje = 0;switch  (xchqrqje) {case 1:long dmvybrvc = 205350881;break;default:short sxwhtdcj = -2069;break;}
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        int shiftedNum = num << 32; // Shifting by 32 is the same as shifting by 0
        return shiftedNum;
    
}
}