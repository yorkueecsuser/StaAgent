class SelfComparisonBug {
    private int value;
    private int unusedVariable; // Dead Store

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        unusedVariable = 10; // The variable is initialized but not used
        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}