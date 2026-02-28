class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself

        // Mutant code: Duplicated assignment
        int duplicatedValue = value;

        // The bug is maintained by comparing the duplicated value with itself
        return duplicatedValue == duplicatedValue;
    }
}