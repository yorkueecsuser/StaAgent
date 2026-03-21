class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        if (true && false && true && false && false && false && true && true && true && true && false) {char nojgdwhl = 'c';}else{float orxvdsxy = 93759185;}
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}