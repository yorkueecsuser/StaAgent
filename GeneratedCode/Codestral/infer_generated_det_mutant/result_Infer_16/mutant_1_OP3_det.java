class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        if (true && false && false && true && false && false && false && false && true && false && false) {boolean iegxufst = true;}
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}