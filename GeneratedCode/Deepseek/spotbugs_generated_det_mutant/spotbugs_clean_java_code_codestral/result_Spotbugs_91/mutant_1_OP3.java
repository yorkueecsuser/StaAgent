class SelfComparisonBug {
    private int value;
    private boolean getUnreachableCondition() { return false; }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        if (getUnreachableCondition()) { // Unreachable if statement
            int temp = value;
            value = temp; // Self comparison that should be a bug
        }
        return value == value; // Original bug remains unchanged
    }
}