class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        if (false && true && false && false && true && true && true && false && false && true && false) {long dsowlpqj = 929289843;}
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}