class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value

        // Mutant code (unreachable while loop)
        boolean condition = false; // This condition is always false, making the loop unreachable
        while (condition) {
            // This code block is unreachable.
            System.out.println("This is an unreachable code block");
        }
    }

    // Helper method to return false. This method is used to dynamically determine the condition.
    private boolean getCondition() {
        return false;
    }
}