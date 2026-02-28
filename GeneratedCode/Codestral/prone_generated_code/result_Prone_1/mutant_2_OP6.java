class AlwaysThrowsBug {
    public int showBug(int n) {
        boolean condition = false;
        // Insert an unreachable for loop
        for (int i = 0; condition; i++) {
            System.out.println("This is an unreachable loop");
        }

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    // Method to return the condition for the loop
    private boolean getCondition() {
        return false;
    }
}