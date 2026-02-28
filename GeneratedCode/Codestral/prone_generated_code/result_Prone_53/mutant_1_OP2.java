class BugDemonstration {

    public String overriddenMethod() {
        return "Overridden method";
        return "Overridden method"; // Duplicated return statement
    }

    public String nonOverriddenMethod() {
        return overriddenMethod();
    }

    public String showBug() {
        return nonOverriddenMethod();
    }
}