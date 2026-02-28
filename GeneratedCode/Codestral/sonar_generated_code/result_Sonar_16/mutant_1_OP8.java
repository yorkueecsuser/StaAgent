// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value
    private String a; // Mutant: Renamed variable

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        a = undefinedProperty; // Mutant: Renaming the variable
        System.out.println(a); // This will throw a NullPointerException if the property is not defined
    }

    public String showBug() {
        return a; // Mutant: Renaming the variable; this will return null if the property is not defined
    }
}