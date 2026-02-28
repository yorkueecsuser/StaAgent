class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

    static {
        // Initial assignment
        configValue = "InitialConfig";

        // Later reassignment, indicative of a potential refactor need
        configValue = "UpdatedConfig";

        // Inserting unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            configValue = "UnreachableConfig";
        } else {
            configValue = "StillUpdatedConfig";
        }
    }

    public String showBug() {
        return configValue;
    }

    public static boolean getUnreachableCondition() {
        // This method simulates a condition that is always false for demonstration
        return false;
    }

    public static void main(String[] args) {
        StaticFieldBugExample example = new StaticFieldBugExample();
        // Demonstrating the bug by showing that the value can be changed
        System.out.println("Config Value: " + example.showBug());
    }
}