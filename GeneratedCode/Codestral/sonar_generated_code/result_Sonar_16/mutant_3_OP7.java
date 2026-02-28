// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop is unreachable, so this code will never be executed
            System.out.println("This is an unreachable while loop");
        }
        System.out.println(undefinedProperty); // This will throw a NullPointerException if the property is not defined
    }

    public String showBug() {
        return undefinedProperty; // This will return null if the property is not defined
    }
}