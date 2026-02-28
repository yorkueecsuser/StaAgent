class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition(); // Assuming getCondition() is defined elsewhere
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    private boolean getCondition() {
        return false; // This method returns a constant false, making the for loop unreachable
    }
}