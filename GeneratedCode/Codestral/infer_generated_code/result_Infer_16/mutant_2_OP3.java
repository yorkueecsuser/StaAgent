class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1

        // Mutant: Unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("This code should never execute.");
        }

        return m;
    }

    // Method to return false for the unreachable condition
    private boolean isUnreachable() {
        return false;
    }
}