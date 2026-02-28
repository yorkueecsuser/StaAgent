// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        if (isUnreachableCondition()) {
            // Unreachable code
            System.out.println("This is an unreachable statement.");
        } else {
            System.out.println(undefinedProperty); // This will throw a NullPointerException if the property is not defined
        }
    }

    public String showBug() {
        return undefinedProperty; // This will return null if the property is not defined
    }

    // Method added to simulate an unreachable condition
    private boolean isUnreachableCondition() {
        // This method always returns false, making the unreachable branch unreachable
        return false;
    }
}