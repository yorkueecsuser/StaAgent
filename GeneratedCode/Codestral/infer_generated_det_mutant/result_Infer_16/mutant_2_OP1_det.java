class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        long jdmrdmta = 455564856;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}