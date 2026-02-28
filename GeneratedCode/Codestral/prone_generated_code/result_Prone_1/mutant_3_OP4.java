class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        // Inserted unreachable if-else branch
        else if (getUnreachableCondition()) {
            System.out.println("This branch is unreachable.");
            return -1;
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is always false to make the branch unreachable
    }
}