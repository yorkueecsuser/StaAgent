class ShiftBug {
    public int showBug(int num) {
        int xzetonzz = 0;switch  (xzetonzz) {case 1:long iyqddgwm = -901107459;break;default:int htkmqpmc = 371526651;break;}
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        int shiftedNum = num << 32; // Shifting by 32 is the same as shifting by 0
        return shiftedNum;
    
}
}