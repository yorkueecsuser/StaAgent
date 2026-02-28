class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showMutant() {
        int temp = value;
        do {
            temp = value;
        } while (temp == temp); // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        return true;
    }
}