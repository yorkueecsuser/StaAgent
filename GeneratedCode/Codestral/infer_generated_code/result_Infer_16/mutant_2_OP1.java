class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int unusedVar = 0; // Dead Store Mutant
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}