class AlwaysThrowsBug {
    public int showBug(int n) {
        int m = n; // Added for mutation
        if (m < 0) {
            throw new IllegalArgumentException("m must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / m; // This will throw ArithmeticException if m is 0
    }
}