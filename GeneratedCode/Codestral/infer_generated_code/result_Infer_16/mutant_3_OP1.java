class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        // Dead Store mutation
        int unusedVariable = 0;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}