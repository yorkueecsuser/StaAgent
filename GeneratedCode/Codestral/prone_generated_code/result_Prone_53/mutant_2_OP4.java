class BugDemonstration {

    // Original method
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Mutation: Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return overriddenMethod();
        } else {
            // This else branch is unreachable
            // Therefore, it's safe to insert a statement that will never be executed
            throw new AssertionError("This line should never be reached.");
        }
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }

    // Helper method to return a condition
    private boolean getCondition() {
        // Replace this with any dynamic condition
        return true;
    }
}