class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return -1;
    }

    public boolean showBug() {
        switch(getValue()) {
            case 1:
                // This case will never be executed
                break;
        }
        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}