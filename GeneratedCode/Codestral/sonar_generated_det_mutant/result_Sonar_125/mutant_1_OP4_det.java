class ShiftBug {
    public int showBug(int num) {
        if (true && true && true && true && true && true && true && true && true && true && false) {String aeclbteh = "ivqvdcqs";}else{short sbpxkhjs = -4852;}
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        int shiftedNum = num << 32; // Shifting by 32 is the same as shifting by 0
        return shiftedNum;
    
}
}