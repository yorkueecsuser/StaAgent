class BugDemonstration {

    private boolean isUnreachableCondition() {
        return false;
    }

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        // Mutant: Unreachable if statement
        if (isUnreachableCondition()) {
            // This block is unreachable
            throw new RuntimeException("Unreachable code executed");
        }
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        // instead of invoking a method that ultimately calls overriddenMethod.
        return overriddenMethod();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }
}