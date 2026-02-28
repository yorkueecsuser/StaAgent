class AlwaysThrowsBug {
    public int showBug(int n) {
        int deadstore = 42; // Dead Store added
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }
}