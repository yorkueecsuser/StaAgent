class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
        this.value = value; // Mutation: Duplicate assignment statement
    }

    public boolean showBug() {
        return value == value; // Original bug: Self comparison of field with itself
    }
}