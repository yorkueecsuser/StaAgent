class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        for  (int pvbxujbg = 0; pvbxujbg < 0; pvbxujbg++) {char lbctruxg = 'l';}
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}