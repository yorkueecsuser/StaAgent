class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        if (checkCondition()) { // Unreachable if statement
            throw new UnsupportedOperationException("This branch should never be reached");
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    private boolean checkCondition() {
        return false; // Always returns false
    }
}