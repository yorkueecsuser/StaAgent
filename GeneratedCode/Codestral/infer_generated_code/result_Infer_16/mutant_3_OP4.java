class IntegerOverflowL1 {
    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the condition unreachable
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1

        // Inserted unreachable if-else statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This line should not be executed");
        } else {
            // This code is also unreachable
            System.out.println("This line should also not be executed");
        }

        return m;
    }
}