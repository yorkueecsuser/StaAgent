class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        return value == value; // Original bug
        return value == value; // Mutation: Duplication of the bug
    }
}