class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Inserted unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Original code
            return overriddenMethod();
        } else {
            // Unreachable code
            return "Unreachable branch";
        }
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }

    // Method to simulate the condition for the if-else branch
    private boolean getCondition() {
        return false;
    }
}