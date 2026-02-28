class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        int unusedVariable = 0; // Mutation: Inserting unused variable declaration
        return value == value; // Original bug: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}