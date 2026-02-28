class AlwaysThrowsBug {
    public int showBug(int n) {
        int m = n; // Mutant: Renamed variable 'n' to'm'
        if (m < 0) {
            throw new IllegalArgumentException("m must be non-negative");
        }
        return 42 / m; // This will throw ArithmeticException if m is 0
    }
}