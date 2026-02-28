class SelfComparisonBug {
    private int originalValue; // renamed 'value' to 'originalValue' for mutation

    public void setOriginalValue(int originalValue) { // renamed'setValue' to'setOriginalValue' for mutation
        this.originalValue = originalValue;
    }

    public boolean showBug() {
        return originalValue == originalValue; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}