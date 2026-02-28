class SelfComparisonBug {
    private boolean getUnreachableCondition() {
        return false; // Always return false to make the condition unreachable
    }

    public boolean showBug(int value) {
        // Original bug: Self comparison of value with itself
        if (getUnreachableCondition()) {
            // Unreachable if statement as per Unreachable if statement mutation operator
            System.out.println("This line should never be executed.");
        }
        return value == value; // Self comparison of value with itself
    }
}