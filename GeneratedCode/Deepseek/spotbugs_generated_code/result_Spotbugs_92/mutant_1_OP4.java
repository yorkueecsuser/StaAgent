class SelfComparisonBug {
    public boolean showBug(int value) {
        // Original bug
        boolean originalComparison = value == value;

        // Mutation: Unreachable if-else statement
        if (getUnreachableCondition()) {
            int newValue = value + 1; // This line of code is unreachable
        } else {
            return originalComparison; // This branch is unreachable but it's here to avoid compile errors
        }

        // Original bug - this line of code is reachable
        return originalComparison;
    }

    // Method to return a condition that is always false for the mutation
    private boolean getUnreachableCondition() {
        return false;
    }
}