class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Mutation Operator: Unreachable while loop
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This code is unreachable, as the condition is always false
            System.out.println("This is an unreachable loop");
        }

        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        // instead of invoking a method that ultimately calls overriddenMethod.
        return overriddenMethod();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }

    // Helper method to return a false condition
    private boolean getCondition() {
        return false;
    }
}