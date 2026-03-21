class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int ktwqgxwj = 103712242;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}