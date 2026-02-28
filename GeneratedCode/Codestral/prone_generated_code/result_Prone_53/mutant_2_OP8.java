class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    // Renamed method based on the Mutation Operator
    public String r() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        // instead of invoking a method that ultimately calls overriddenMethod.
        // For the mutant, we will call the renamed method 'r' instead.
        return r();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }
}