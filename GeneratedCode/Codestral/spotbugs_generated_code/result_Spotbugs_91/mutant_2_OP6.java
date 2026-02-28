class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Inserted unreachable for loop
        }
        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_SELF_COMPARISON)
    }
}