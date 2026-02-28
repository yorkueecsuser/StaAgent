class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

    static {
        // Initial assignment
        configValue = "InitialConfig";

        // Later reassignment, indicative of a potential refactor need
        configValue = "UpdatedConfig";
        
        // Mutation Operator: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will always be printed in the static block");
        }
    }

    public String showBug() {
        return configValue;
    }

    public static void main(String[] args) {
        StaticFieldBugExample example = new StaticFieldBugExample();

        // Mutation Operator: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed in main.");
        } else {
            System.out.println("This will always be printed in main.");
        }
        
        // Demonstrating the bug by showing that the value can be changed
        System.out.println("Config Value: " + example.showBug());
    }

    private static boolean getCondition() {
        return false; // This makes the if condition false, ensuring the else branch executes
    }
}