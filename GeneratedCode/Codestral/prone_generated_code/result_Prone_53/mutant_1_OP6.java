class BugDemonstration {

    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        boolean conditionFor = getCondition(); // Always returns false to make the loop unreachable
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable since the condition is always false
        }
        return overriddenMethod();
    }

    public String showBug() {
        return nonOverriddenMethod();
    }

    // This is a method to provide the condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}