class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        int tempValue = this.value;
        return value == tempValue; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}