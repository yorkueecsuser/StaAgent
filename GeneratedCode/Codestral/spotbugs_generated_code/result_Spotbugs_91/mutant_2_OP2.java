class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
        this.value = this.value; // Mutated code: Duplicated assignment statement
    }

    public boolean showBug() {
        return value == value; // Original bug: Self comparison of field with itself
    }
}