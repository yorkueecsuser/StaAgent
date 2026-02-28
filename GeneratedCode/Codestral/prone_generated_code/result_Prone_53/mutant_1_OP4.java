class BugDemonstration {
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        boolean shouldNotRun = false;

        // Inserted unreachable if-else statement
        if (shouldNotRun) {
            // This code is unreachable
            return "Unreachable code";
        } else {
            return overriddenMethod();
        }
    }

    public String showBug() {
        return nonOverriddenMethod();
    }
}