class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n < 0) { // Duplicated condition
            // No operation here, only duplicated for mutation
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }
}