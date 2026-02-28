class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    private boolean getFalseCondition() { // Method to always return false
        return false;
    }

    public boolean showBug() {
        while (getFalseCondition()) { // Unreachable while loop
            System.out.println("This is an unreachable statement.");
        }
        return value == value; // Original bug remains
    }
}