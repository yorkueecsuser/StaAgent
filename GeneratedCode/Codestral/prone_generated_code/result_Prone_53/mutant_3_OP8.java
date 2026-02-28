class BugDemonstration {

    // Original code
    public String overriddenMethod() {
        return "Overridden method";
    }

    // Mutant code - Renamed overriddenMethod to r
    public String r() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Updated code to call the renamed method
        return r();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }
}