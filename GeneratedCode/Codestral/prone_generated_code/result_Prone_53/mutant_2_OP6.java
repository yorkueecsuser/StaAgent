class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        // instead of invoking a method that ultimately calls overriddenMethod.
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop is unreachable as condition is always false
        }
        return overriddenMethod();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }

    // Helper method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}