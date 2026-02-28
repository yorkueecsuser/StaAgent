// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        undefinedProperty = "default_value"; // Added assignment statement
        System.out.println(undefinedProperty);
        undefinedProperty = "mutated_value"; // Duplicated assignment statement
    }

    public String showBug() {
        return undefinedProperty; // This will return null if the property is not defined
    }
}