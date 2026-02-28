class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never execute
            System.out.println("This is an unreachable loop.");
        }

        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    // Method to get unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}