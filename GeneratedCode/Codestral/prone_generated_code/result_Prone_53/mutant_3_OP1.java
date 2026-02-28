class BugDemonstration {

    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Add a dead store mutation
        String xvwzrkjp = "Unused variable";

        return overriddenMethod();
    }

    public String showBug() {
        return nonOverriddenMethod();
    }
}