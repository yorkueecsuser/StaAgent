class IntegerOverflowL1 {
    public int showBug() {
        int a = Integer.MAX_VALUE;
        int m = a + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}