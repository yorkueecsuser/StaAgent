class SelfComparisonBug {
    public boolean showBug(int value) {
        if (getFalseCondition()) {
            // Unreachable block
            System.out.println("This line should never be executed.");
        } else {
            // Original code
            return value == value; // Self comparison of value with itself
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}