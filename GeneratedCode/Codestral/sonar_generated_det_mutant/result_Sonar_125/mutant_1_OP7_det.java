class ShiftBug {
    public int showBug(int num) {
        boolean hhjhuxbz = false;while (hhjhuxbz && true && false && false && false && false && true && false && true && true && false && false) {short qduevufu = 7367;}
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        int shiftedNum = num << 32; // Shifting by 32 is the same as shifting by 0
        return shiftedNum;
    
}
}