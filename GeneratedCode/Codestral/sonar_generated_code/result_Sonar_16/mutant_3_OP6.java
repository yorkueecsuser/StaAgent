// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        boolean conditionFor = getCondition(); // Creating a non-final variable to avoid using compile-time constants
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("Unreachable loop execution");
        }
        System.out.println(undefinedProperty); // This will throw a NullPointerException if the property is not defined
    }

    public String showBug() {
        return undefinedProperty; // This will return null if the property is not defined
    }

    private boolean getCondition() { // Method to dynamically determine the condition at runtime
        return false;
    }
}