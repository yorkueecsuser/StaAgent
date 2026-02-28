class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean condition = false;
        if (condition) {
            // Unreachable code block
            return true;
        } else {
            // Original buggy code
            return value == value; // Self comparison of value with itself
        }
    }
}