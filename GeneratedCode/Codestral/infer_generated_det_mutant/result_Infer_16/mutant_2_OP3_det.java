class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        if (true && true && true && true && false && true && true && false && false && false && false) {double qgekrtak = 953883723;}
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}