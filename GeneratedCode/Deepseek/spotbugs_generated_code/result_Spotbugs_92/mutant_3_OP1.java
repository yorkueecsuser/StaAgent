class SelfComparisonBug {
    public boolean showBug(int value) {
        int mutantVar = 0;  // Dead store mutant
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    }
}