class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

    static {
        // Initial assignment
        configValue = "InitialConfig";

        // Unreachable for loop mutation
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
            System.out.println("Unreachable code inside for loop");
        }

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

    // Helper method to provide a runtime condition
    private static boolean getConditionFor() {
        return false; // Ensures the for loop is unreachable
    }
}