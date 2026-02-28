class BugDemonstration {

    public String overriddenMethod() {
        return "Overridden method";
    }

    // Mutant code: Renamed nonOverriddenMethod to n
    public String n() {
        return overriddenMethod();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        // Mutant code: Calling the renamed nonOverriddenMethod
        return n();
    }

    // Mutant code: Renamed overriddenMethod to r
    public String r() {
        return "Overridden method";
    }
}