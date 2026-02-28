class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    private boolean getCondition() {
        return false;
    }

    public boolean showBug() {
        boolean isConditionMet = getCondition();
        if (isConditionMet) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Original code
            return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        }
    }
}