// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // Original variable
    private String a; // Renamed variable

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        System.out.println(a); // Using the renamed variable
        System.out.println(undefinedProperty); // This will throw a NullPointerException if the property is not defined
    }

    public String showBug() {
        return a; // Using the renamed variable
        // This will return null if the property is not defined
    }
}