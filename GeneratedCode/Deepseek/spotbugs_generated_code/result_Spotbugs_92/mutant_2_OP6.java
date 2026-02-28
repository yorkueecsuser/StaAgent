class SelfComparisonBug {
    public boolean showBug(int value) {
        // Original buggy line
        return value == value; // Self comparison of value with itself

        // Mutant code: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This line will never be executed.");
        }
    }

    // Helper method to return a false condition
    private boolean getCondition() {
        return false;
    }
}