class AlwaysThrowsBug {
    public int showBug(int n) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the for loop unreachable
    }
}