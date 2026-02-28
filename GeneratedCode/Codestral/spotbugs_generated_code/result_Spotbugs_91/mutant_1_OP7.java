class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    private boolean getCondition() {
        return false;
    }

    public boolean showBug() {
        while (getCondition()) {
            // Unreachable while loop as per the mutation operator information
        }
        return value == value; // Original bug: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}