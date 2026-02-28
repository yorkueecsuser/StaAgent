class StaticFieldBugExample {

    // A public static field that should be final but isn't
    public static String configValue; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)

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
    }
}

// Mutated version with a renamed variable
class StaticFieldBugExampleMutant {

    // A public static field that should be final but isn't
    public static String a; // Renamed from configValue

    static {
        // Initial assignment
        a = "InitialConfig";

        // Later reassignment, indicative of a potential refactor need
        a = "UpdatedConfig";
    }

    public String showBug() {
        return a;
    }

    public static void main(String[] args) {
        StaticFieldBugExampleMutant b = new StaticFieldBugExampleMutant(); // Renamed from example
        // Demonstrating the bug by showing that the value can be changed
        System.out.println("Config Value: " + b.showBug()); // Renamed from example.showBug()
    }
}