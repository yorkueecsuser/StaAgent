class AlwaysThrowsBug {
    public int showBug(int n) {
        boolean unreachableCondition = getUnreachableCondition();

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }

        // Mutation Operator: Unreachable switch statement
        switch (unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        return 42 / n; // This will throw ArithmeticException if n is 0
    }

    // Auxiliary method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}