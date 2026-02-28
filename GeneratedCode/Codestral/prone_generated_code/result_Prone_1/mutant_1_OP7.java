class AlwaysThrowsBug {
    private boolean getCondition() {
        return false; // This method returns a false value to avoid unreachable statement errors
    }

    public int showBug(int n) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop inserted
            System.out.println("This code is unreachable");
        }

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }
}