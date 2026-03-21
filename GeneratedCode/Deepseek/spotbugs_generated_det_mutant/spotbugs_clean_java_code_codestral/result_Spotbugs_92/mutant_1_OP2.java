class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        // Original code
        return value == value;

        // Mutated code: Duplicate the assignment statement
        value = value; // This is a duplicate of the original comparison, which does not change its behavior but adds a potential side effect
        return value == value;
    }
}