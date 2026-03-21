class ShiftBug {
    public int showBug(int num) {
        int wabuczjm = 0;switch  (wabuczjm) {case 1:byte kkkladhv = -53;break;default:char eakohmjf = 'd';break;}
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        int shiftedNum = num << 32; // Shifting by 32 is the same as shifting by 0
        return shiftedNum;
    
}
}