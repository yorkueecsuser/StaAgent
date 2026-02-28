class AlwaysThrowsBug {
    public int showBug(int n) {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code, intentionally left blank
        }

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }
}