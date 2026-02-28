class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

    static {
        // Introduce a non-final boolean variable to use in the while loop
        boolean conditionWhile = false; // This condition will make the loop unreachable

        // Unreachable while loop inserted
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is an unreachable while loop.");
        }

        // Initial assignment
        configValue = "InitialConfig";

        // Later reassignment, indicative of a potential refactor need
        configValue = "UpdatedConfig";
    }

    public String showBug() {
        return configValue;
    }

    public static void main(String[] args) {
        StaticFieldBugExample example = new StaticFieldBugExample();
        // Demonstrating the bug by showing that the value can be changed
        System.out.println("Config Value: " + example.showBug());
    }
}