class ShiftBug {
    public int showBug(int num) {
        for  (int qxcpnwim = 0; qxcpnwim < 0; qxcpnwim++) {int zzerokoy = 150524771;}
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        int shiftedNum = num << 32; // Shifting by 32 is the same as shifting by 0
        return shiftedNum;
    
}
}