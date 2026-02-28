class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    private boolean getFalseCondition() {
        return false;   // Create a method to return a false condition dynamically.
    }

    public boolean showBug() {
        if (getFalseCondition()) { // Insert an unreachable if branch using the method.
            System.out.println("This should not be printed.");
        }
        return value == value; // Original bug is still in place.
    }
}