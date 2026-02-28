// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // Original variable
    private String z; // Mutant: Renamed variable

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        System.out.println(undefinedProperty);
        System.out.println(z); // Mutant: Using the renamed variable
    }

    public String showBug() {
        return z; // Mutant: Returning the renamed variable
    }
}