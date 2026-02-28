class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        // Mutant code
        int x = m; // renamed'm' to 'x' according to the Renaming mutation operator
        return x;
    }
}