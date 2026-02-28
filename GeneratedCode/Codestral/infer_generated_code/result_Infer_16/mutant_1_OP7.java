class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        boolean condition = getCondition();

        // Unreachable while loop mutant
        while (condition) {
            // This loop will never be executed since the condition is always false
        }

        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }

    // This method is used to dynamically determine the condition of the unreachable while loop
    // In this case, it always returns false to make the loop unreachable
    private boolean getCondition() {
        return false;
    }
}