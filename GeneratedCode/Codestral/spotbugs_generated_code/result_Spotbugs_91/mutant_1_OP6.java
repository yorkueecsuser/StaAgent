class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        // Inserted unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("Unreachable code");
        }

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    private boolean getCondition() {
        return false;
    }
}