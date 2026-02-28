class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

    static {
        // Initial assignment
        configValue = "InitialConfig";

        // Later reassignment, indicative of a potential refactor need
        configValue = "UpdatedConfig";

        // Adding an unreachable switch statement based on the provided mutation operator
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case, also unreachable
                System.out.println("Default case");
        }
    }

    // Helper method to ensure the switch statement is dynamically determined
    private static int getUnreachableValue() {
        return 999; // A value that doesn't match any case in the switch statement
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