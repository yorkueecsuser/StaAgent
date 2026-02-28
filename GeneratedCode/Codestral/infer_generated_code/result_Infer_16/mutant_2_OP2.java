class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // Original code
        int m2 = m; // Mutated code: Duplication of assignment statement
        return m;
    }
}