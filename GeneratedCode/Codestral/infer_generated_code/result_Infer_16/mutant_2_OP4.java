class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable, but if we add any code here,
            // it should not cause a compilation error.
            // For instance, let's add a simple print statement.
            System.out.println("This line should never execute.");
        } else {
            // This is the original else branch that would have been executed if the if branch was reachable.
        }

        return m;
    }
}