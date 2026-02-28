class SelfComparisonBug {
    private int value;
    private int deadStore;  // Mutant: Dead store added

    public void setValue(int value) {
        this.value = value;
        this.deadStore = 0;  // Initialize dead store to avoid potential compiler warning
    }

    public boolean showBug() {
        return value == value;  // Original bug remains: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}