class AlwaysThrowsBug {
    public int showBug(int n) {
        int r = n; // Mutation: Renamed variable `n` to `r`
        if (r < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / r; // This will throw ArithmeticException if r is 0
    }
}