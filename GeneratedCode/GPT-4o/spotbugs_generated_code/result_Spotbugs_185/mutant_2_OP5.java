class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

    static {
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
        
        // Mutation: Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                // This block is intentionally left empty
                break;
        }
    }

    private static int getUnreachableCondition() {
        return 0; // Always returns 0 making the switch statement effectively unreachable
    }
}