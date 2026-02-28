class AlwaysThrowsBug {
    public int showBug(int n) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code block
            System.out.println("This block should never execute.");
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    private boolean getUnreachableCondition() {
        // This method should always return false to keep the condition unreachable
        return false;
    }
}