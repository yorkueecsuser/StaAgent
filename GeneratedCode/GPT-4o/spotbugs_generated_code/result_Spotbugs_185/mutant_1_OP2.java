class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

    static {
        // Initial assignment
        configValue = "InitialConfig";
        configValue = "InitialConfig"; // Mutated code: Duplicate assignment statement

        // Later reassignment, indicative of a potential refactor need
        configValue = "UpdatedConfig";
        configValue = "UpdatedConfig"; // Mutated code: Duplicate assignment statement
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