class BugDemonstration {

    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        int mutantVar; // Dead store mutant
        return overriddenMethod();
    }

    public String showBug() {
        return nonOverriddenMethod();
    }
}